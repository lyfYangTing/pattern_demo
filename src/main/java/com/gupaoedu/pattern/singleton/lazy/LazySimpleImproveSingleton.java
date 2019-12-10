package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName LazySimpleSingleton
 * @Description 懒汉式单例简单实现:解决了线程安全的问题 但是执行效率低
 * @Author yangting
 * @Date 2019/12/5 8:43 下午
 * @Version 1.0
 */
public class LazySimpleImproveSingleton {

    private static LazySimpleImproveSingleton lazySimpleImproveSingleton = null;

    private LazySimpleImproveSingleton(){
        if(lazySimpleImproveSingleton != null) {//防止 被反射破坏单例   不能百分百防止
            // 如果是先调用getInstance()方法，则可以避免利用反射创建对象破坏单例
            // 如果先利用反射创建单例
            throw new RuntimeException("不能重复创建单例对象");
        }
    }

    //在外部需要调用获取时才会创建单例对象 加锁将方法变成线程同步方法,解决线程安全问题
    //这种方式在线程数量比较多的情况下,会导致大批线程出现阻塞,导致程序
    public synchronized static LazySimpleImproveSingleton getInstance(){
        if(lazySimpleImproveSingleton == null){
            lazySimpleImproveSingleton = new LazySimpleImproveSingleton();
        }
        return lazySimpleImproveSingleton;
    }
}
