package com.gupaoedu.pattern.proxy.dynamic.jdkproxy;

import com.gupaoedu.pattern.proxy.staticdemo.Person;

/**
 * @ClassName Customer
 * @Description 客户
 * @Author yangting
 * @Date 2019/12/10 4:15 下午
 * @Version 1.0
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高 180cm");
        System.out.println("胸大，6 块腹肌");
    }
}
