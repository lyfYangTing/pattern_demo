package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.Icourse;
import com.gupaoedu.pattern.factory.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Description java课程工厂类
 * @Author yangting
 * @Date 2019-12-04 20:45
 * @Version 1.0
 */
public class JavaCourseFactory implements MethodFactory{

    @Override
    public Icourse getCourseInstance() {
        return new JavaCourse();
    }
}
