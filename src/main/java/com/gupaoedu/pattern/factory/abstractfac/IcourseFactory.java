package com.gupaoedu.pattern.factory.abstractfac;

/**
 * 课程工厂接口
 * 创建一系列工厂
 *
 * 抽象工厂模式(Abastract Factory Pattern)：提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类。
 *
 * 还是以课程为例，
 * 每个课程不仅要提供课程的录播视频，而且还要提供老师的课堂笔记。
 * 相当 于现在的业务变更为同一个课程不单纯是一个课程信息，要同时包含录播视频、课堂笔记甚至还要提供源码才能构成一个完整的课程。
 * 在产品等级中增加两个产品 IVideo 录播 视频和 INote 课堂笔记。
 *
 * 一门课程 为1个 产品族
 * 产品登机 录播视频 课堂笔记
 *
 * 缺点:
 * 1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。
 * 2、增加了系统的抽象性和理解难度。
 *
 *
 */
public interface IcourseFactory {

    /**
     * 录制视频
     */
    Irecord getRecord();


    /**
     * 笔记
     * @return
     */
    INote getNote();
}
