package com.gupaoedu.pattern.prototype;

/**
 * @ClassName Client
 * @Description 测试
 * @Author yangting
 * @Date 2019/12/9 3:28 下午
 * @Version 1.0
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public static Prototype startClone(Prototype clonePrototype){
        return clonePrototype.clone();
    }
}
