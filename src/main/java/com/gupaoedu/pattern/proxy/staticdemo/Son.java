package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName Son
 * @Description 儿子类
 * @Author yangting
 * @Date 2019/12/10 2:42 下午
 * @Version 1.0
 */
public class Son implements Person{

    @Override
    public void findLove() {
        System.out.println("儿子要求:肤白貌美大长腿");
    }

}
