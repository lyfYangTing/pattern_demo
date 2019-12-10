package com.gupaoedu.pattern.singleton.lazy;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description 静态内部类懒汉式单例实现
 * @Author yangting
 * @Date 2019/12/5 9:43 下午
 * @Version 1.0
 */
//完美的单例模式的实现方式
public class LazyInnerClassSingleton {

    private static LazyInnerClassSingleton lazyInnerClassSingleton = null;

    private LazyInnerClassSingleton(){//防止反射破坏单例  不能100%避免，如果该操作在执行getInstance()之前，则单例就会被破坏
        if(lazyInnerClassSingleton!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.singleton;
    }

    //需要时调用getInstance方法才加载内部类并创建对象  既不浪费内存，也保证了线程安全（类只会被加载一次）【没有用加锁的方式保证，所以效率更高】
    private static class LazyHolder{
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }
}
