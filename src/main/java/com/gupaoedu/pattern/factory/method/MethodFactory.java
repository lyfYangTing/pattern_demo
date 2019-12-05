package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.Icourse;

/**
 * 工厂方法模式(Fatory Method Pattern):定义一个创建对象的接口，但让实现这个 接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 * 优点:用户只需要关心所需产品对应的工厂，无须关心创建细节，而且加入新的产品符 合开闭原则。
 * 工厂方法适用于以下场景:
 * 1、创建对象需要大量重复的代码。
 * 2、客户端(应用层)不依赖于产品类实例如何被创建、实现等细节。
 * 3、一个类通过其子类来指定创建哪个对象。
 *
 * 工厂方法也有缺点:
 * 1、类的个数容易过多，增加复杂度。
 * 2、增加了系统的抽象性和理解难度。
 */
public interface MethodFactory {


    Icourse getCourseInstance();

}
