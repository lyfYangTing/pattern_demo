package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description 双重检查锁单例模式 解决了线程安全问题,比直接锁方法效率要高一点
 * @Author yangting
 * @Date 2019/12/5 9:32 下午
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){//外面的这个判断 可以减少被阻塞的线程数
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
