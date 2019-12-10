package com.gupaoedu.pattern.prototype;

/**
 * @ClassName Prototype
 * @Description 原型模式 创建型模式
 * 原型模式(Prototype Pattern)是指原型实例指定创建对象的种类，并且通过拷贝这些 原型创建新的对象。
 * 原型模式主要适用于以下场景:
 * 1、类初始化消耗资源较多。
 * 2、new 产生的一个对象需要非常繁琐的过程(数据准备、访问权限等)
 * 3、构造函数比较复杂。
 * 4、循环体中生产大量对象时。
 *
 * 原型模式应用:
 * 1、Spring中scope=“prototype”
 * 2、JSON.parseObject()
 *
 * 浅克隆:克隆地址  只是完整 复制了值类型数据，没有赋值引用对象。
 * 深克隆:克隆值
 *
 * @Author yangting
 * @Date 2019/12/9 11:47 上午
 * @Version 1.0
 */
public interface Prototype {

    Prototype clone();

}
