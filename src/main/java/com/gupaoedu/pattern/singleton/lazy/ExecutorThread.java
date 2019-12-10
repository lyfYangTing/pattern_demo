package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName ExecutorThread
 * @Description 多线程测试
 * @Author yangting
 * @Date 2019/12/5 8:50 下午
 * @Version 1.0
 */
public class ExecutorThread implements Runnable{


    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
