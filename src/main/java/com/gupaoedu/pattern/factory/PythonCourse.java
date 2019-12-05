package com.gupaoedu.pattern.factory;

/**
 * @ClassName PythonCourse
 * @Description Python课程
 * @Author yangting
 * @Date 2019-12-04 19:22
 * @Version 1.0
 */
public class PythonCourse implements Icourse{

    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
