package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName LazySimpleSingletonTest
 * @Description 懒汉式单例简单版测试
 * @Author yangting
 * @Date 2019/12/5 8:54 下午
 * @Version 1.0
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        //一定几率出现创建两个不同结果的情况，意味着上面的单例存在线程安全隐患
        Thread thread = new Thread(new ExecutorThread());
        Thread thread1 = new Thread(new ExecutorThread());

        thread.start();
        thread1.start();

        System.out.println("End");
    }
}
