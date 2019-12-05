package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.Icourse;
import com.gupaoedu.pattern.factory.method.JavaCourseFactory;
import com.gupaoedu.pattern.factory.method.MethodFactory;
import com.gupaoedu.pattern.factory.method.PythonCourseFactory;

/**
 * @ClassName MethodTest
 * @Description 工厂方法测试类
 * @Author yangting
 * @Date 2019-12-04 20:46
 * @Version 1.0
 */
public class MethodTest {


    public static void main(String[] args) {
        MethodFactory methodFactory = new PythonCourseFactory();
        Icourse icourse = methodFactory.getCourseInstance();
        icourse.record();

        methodFactory = new JavaCourseFactory();
        methodFactory.getCourseInstance().record();
    }
}

