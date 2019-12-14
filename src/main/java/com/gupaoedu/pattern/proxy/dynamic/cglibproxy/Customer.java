package com.gupaoedu.pattern.proxy.dynamic.cglibproxy;

/**
 * @ClassName Customer
 * @Description  CGLib 代理的目标对象不需要实现任何接口，它是通过动态继承目标对象 实现的动态代理。
 * @Author yangting
 * @Date 2019/12/14 6:48 下午
 * @Version 1.0
 */
public class Customer {

    public void findLove(){
        System.out.println("肤白貌美大象腿");
    }
}
