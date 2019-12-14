package com.gupaoedu.pattern.proxy.mydynamic;

import java.lang.reflect.Method;

/**
 * @ClassName GPInvocationHandler
 * @Description 类似于JDK中的InvocationHandler接口
 * @Author yangting
 * @Date 2019/12/10 6:36 下午
 * @Version 1.0
 */
public interface GPInvocationHandler {

    /**
     *
     * @param proxy 代理类对象
     * @param method  目标类 实现接口中的方法
     * @param args 接口中的方法
     * @return
     */
    public Object invoke(Object proxy, Method method, Object[] args);

}
