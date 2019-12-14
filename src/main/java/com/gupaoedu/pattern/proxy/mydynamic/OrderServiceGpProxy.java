package com.gupaoedu.pattern.proxy.mydynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName OrderServiceGpProxy
 * @Description 代理类
 * @Author yangting
 * @Date 2019/12/12 2:40 下午
 * @Version 1.0
 */
public class OrderServiceGpProxy implements GPInvocationHandler {

    //被代理对象
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        before();
        try {
            return method.invoke(this.target,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            after();
        }
        return null;
    }

    private void before(){
        System.out.println("........before");
    }


    private void after(){
        System.out.println("........after");
    }
}
