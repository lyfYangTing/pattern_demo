package com.gupaoedu.pattern.proxy.dynamic.jdkproxy;

import com.gupaoedu.pattern.proxy.staticdemo.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Description 数据源动态路由业务 代理类
 * @Author yangting
 * @Date 2019/12/10 4:44 下午
 * @Version 1.0
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //取Order参数
        before(args[0]);
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }


    private void before(Object target){//获取数据源
        try {
            Class<?> clazz = target.getClass();
            Method method = clazz.getMethod("getCreateTime",null);
            Date createDate = (Date) method.invoke(target,null);
            String dbRouter = yearFormat.format(createDate);
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
            DynamicDataSourceEntry.set(dbRouter);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("Proxy after method");
    }
}
