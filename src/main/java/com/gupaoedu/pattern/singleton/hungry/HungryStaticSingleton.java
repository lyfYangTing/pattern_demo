package com.gupaoedu.pattern.singleton.hungry;

/**
 * @ClassName HungryStaticSingleton
 * @Description 静态代码库实现饿汉式单例
 * @Author yangting
 * @Date 2019/12/5 8:34 下午
 * @Version 1.0
 */
public class HungryStaticSingleton {

    //保证赋值一次之后就不能被修改
    private final static HungryStaticSingleton hungryStaticSingleton;

    private HungryStaticSingleton(){
        if(hungryStaticSingleton != null){//防止 被反射破坏单例
            throw new RuntimeException("不能重复创建单例对象");
        }
    }

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    //提供全局访问点
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
