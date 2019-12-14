package com.gupaoedu.pattern.proxy.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JDKMeipo
 * @Description 媒婆(婚介)类
 * @Author yangting
 * @Date 2019/12/10 4:04 下午
 * @Version 1.0
 */
public class JDKMeipo implements InvocationHandler {

    //被代理的对象，把引用给保存下来
    private Object target;

    //获取代理类对象
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }

    private void before(){
        System.out.println("我是媒婆:我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
