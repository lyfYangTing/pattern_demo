package com.gupaoedu.pattern.factory.simple;

import com.gupaoedu.pattern.factory.Icourse;
import com.gupaoedu.pattern.factory.JavaCourse;
import com.gupaoedu.pattern.factory.simple.SimpleFactory;

/**
 * @ClassName SimpleTest
 * @Description 简单工厂模式测试类
 * @Author yangting
 * @Date 2019-12-04 19:34
 * @Version 1.0
 */
public class SimpleTest {

    public static void main(String[] args) {
        //Icourse icourse = SimpleFactory.getCourse("python");
        //Icourse icourse = SimpleFactory.getCourse("com.gupaoedu.pattern.factory.simple.PythonCourse");
        Icourse icourse = SimpleFactory.getCourse(JavaCourse.class);
        icourse.record();
    }
}
