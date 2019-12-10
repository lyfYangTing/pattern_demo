package com.gupaoedu.pattern.singleton.threadlocal;

/**
 * @ClassName ThreadLocalSingleton
 * @Description 线程单例
 * @Author yangting
 * @Date 2019/12/6 8:42 下午
 * @Version 1.0
 *
 * ThreadLocal 不能保证其 创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全。
 */
public class ThreadLocalSingleton {

    private final static ThreadLocal<ThreadLocalSingleton> thread = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return thread.get();
    }

}
