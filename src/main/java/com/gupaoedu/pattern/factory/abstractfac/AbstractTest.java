package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName AbstractTest
 * @Description 抽象工厂测试
 * @Author yangting
 * @Date 2019-12-04 21:20
 * @Version 1.0
 */
public class AbstractTest {


    public static void main(String[] args) {
        IcourseFactory factory = new JavaCourseFactory();
        INote note = factory.getNote();
        Irecord irecord = factory.getRecord();
        note.note();
        irecord.record();

        factory = new PythonCourseFactory();
        note = factory.getNote();
        irecord = factory.getRecord();
        note.note();
        irecord.record();

    }
}
