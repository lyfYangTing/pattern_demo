package com.gupaoedu.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @ClassName SerializableSingleton
 * @Description 反序列化破坏单例
 * @Author yangting
 * @Date 2019/12/6 7:31 下午
 * @Version 1.0
 */
//反序列化时导致单例破坏
public class SerializableSingleton implements Serializable {

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个 IO 流，写入到其他地方(可以是磁盘、网络 IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为 IO 流
    //通过 IO 流的读取，进而将读取的内容转换为 Java 对象
    //在转换过程中会重新创建对象 new

    private final static SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }



}
