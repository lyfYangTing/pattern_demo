package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName LazySimpleSingleton
 * @Description 懒汉式单例简单实现:线程不安全
 * @Author yangting
 * @Date 2019/12/5 8:43 下午
 * @Version 1.0
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    //在外部需要调用获取时才会创建单例对象
    public static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
