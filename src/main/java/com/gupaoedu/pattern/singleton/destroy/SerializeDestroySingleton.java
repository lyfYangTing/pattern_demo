package com.gupaoedu.pattern.singleton.destroy;

import com.gupaoedu.pattern.singleton.seriable.SerializableSingleton;

import java.io.*;

/**
 * @ClassName SerializeDestorySingleton
 * @Description 序列化方式破坏单例
 * @Author yangting
 * @Date 2019/12/6 7:29 下午
 * @Version 1.0
 */
//反序列化时导致单例破坏  破坏前提:单例类可以被序列化
public class SerializeDestroySingleton {

    public static void main(String[] args) {
        //序列化就是说把内存中的状态通过转换成字节码的形式
        //从而转换一个 IO 流，写入到其他地方(可以是磁盘、网络 IO)
        //内存中状态给永久保存下来了

        //反序列化
        //讲已经持久化的字节码内容，转换为 IO 流
        //通过 IO 流的读取，进而将读取的内容转换为 Java 对象
        //在转换过程中会重新创建对象 new

        SerializableSingleton singleton = SerializableSingleton.getInstance();

        System.out.println("原始对象:" + singleton);
        try {
            FileOutputStream fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(singleton);

            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            singleton = (SerializableSingleton)objectInputStream.readObject();

            System.out.println("序列化后获取的对象:" + singleton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


