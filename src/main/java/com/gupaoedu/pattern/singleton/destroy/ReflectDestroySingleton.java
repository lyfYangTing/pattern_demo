package com.gupaoedu.pattern.singleton.destroy;

import com.gupaoedu.pattern.singleton.hungry.HungrySingleton;
import com.gupaoedu.pattern.singleton.hungry.HungryStaticSingleton;
import com.gupaoedu.pattern.singleton.lazy.LazySimpleImproveSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectDestroySingleton
 * @Description 利用反射破坏单例
 * @Author yangting
 * @Date 2019/12/6 4:55 下午
 * @Version 1.0
 */
public class ReflectDestroySingleton {

    public static void main(String[] args) {
        try {
            //hungrySingletonTest();
            //hungryStaticSingletonTest();
            test();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void hungrySingletonTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过正常方式获取单例对象
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println("正常方式获取的对象:" + hungrySingleton);

        //通过反射获取对象
        Class<?> clazz = HungrySingleton.class;

        //通过反射拿到私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(null);
        //强制访问
        constructor.setAccessible(true);
        //暴力初始化
        Object reflect = constructor.newInstance();

        System.out.println("反射获取的对象:" + reflect);
        System.out.println(hungrySingleton == reflect);

    }


    public static void hungryStaticSingletonTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过正常方式获取单例对象
        HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();

        //通过反射获取对象
        Class<?> clazz = HungryStaticSingleton.class;

        //通过反射拿到私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(null);
        //强制访问
        constructor.setAccessible(true);
        //暴力初始化
        Object reflect = constructor.newInstance();

        System.out.println("反射获取的对象:" + reflect);
        System.out.println("正常方式获取的对象:" + hungryStaticSingleton);
        System.out.println(hungryStaticSingleton == reflect);
    }


    public static void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySimpleImproveSingleton hungryStaticSingleton = LazySimpleImproveSingleton.getInstance();

        //通过反射获取对象
        Class<?> clazz = LazySimpleImproveSingleton.class;

        //通过反射拿到私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(null);
        //强制访问
        constructor.setAccessible(true);
        //暴力初始化
        Object reflect = constructor.newInstance();

        //通过正常方式获取单例对象
        //LazySimpleImproveSingleton hungryStaticSingleton = LazySimpleImproveSingleton.getInstance();

        System.out.println("反射获取的对象:" + reflect);
        System.out.println("正常方式获取的对象:" + hungryStaticSingleton);
        System.out.println(hungryStaticSingleton == reflect);
    }
}
