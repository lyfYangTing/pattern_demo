package com.gupaoedu.pattern.singleton.hungry;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例:适用于系统中单例对象较少的情况
 * @Author yangting
 * @Date 2019/12/5 7:48 下午
 * @Version 1.0
 */
public class HungrySingleton {

    //先静态 后动态
    //先属性 后方法
    //先上后下

    //类加载时立即初始化并创建单例对象  保证全局唯一,绝对线程安全
    public final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if(hungrySingleton !=null){//防止 被反射破坏单例
            throw new RuntimeException("不能重复创建单例对象");
        }
    }

    //提供一个全局访问点
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
