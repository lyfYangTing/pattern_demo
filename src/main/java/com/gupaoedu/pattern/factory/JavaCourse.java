package com.gupaoedu.pattern.factory;

/**
 * @ClassName JavaCourse
 * @Description Java课程
 * @Author yangting
 * @Date 2019-12-04 19:22
 * @Version 1.0
 */
public class JavaCourse implements Icourse{

    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
