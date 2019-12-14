package com.gupaoedu.pattern.proxy.dynamic.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @ClassName CglibTest
 * @Description
 * @Author yangting
 * @Date 2019/12/13 5:30 下午
 * @Version 1.0
 */
public class CglibTest {

    public static void main(String[] args) {

        //利用 cglib 的代理类可以将内存中的 class 文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangting/java/githubProject/pattern/");

        //CGLib 代理的目标对象不需要实现任何接口，它是通过动态继承目标对象 实现的动态代理。
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
