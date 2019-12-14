package com.gupaoedu.pattern.proxy.dynamic.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibMeipo
 * @Description
 * @Author yangting
 * @Date 2019/12/13 5:17 下午
 * @Version 1.0
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //指定父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }

    private void before(){
        System.out.println("cglib before");
    }

    private void after(){
        System.out.println("cglib after");
    }
}
