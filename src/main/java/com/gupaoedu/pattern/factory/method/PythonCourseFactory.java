package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.Icourse;
import com.gupaoedu.pattern.factory.PythonCourse;

/**
 * @ClassName PythonCourseFactory
 * @Description python课程工厂类
 * @Author yangting
 * @Date 2019-12-04 20:45
 * @Version 1.0
 */
public class PythonCourseFactory implements MethodFactory{

    @Override
    public Icourse getCourseInstance() {
        return new PythonCourse();
    }
}
