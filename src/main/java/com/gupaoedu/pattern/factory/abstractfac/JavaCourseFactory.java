package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName JavaCourse
 * @Description Java课程
 * @Author yangting
 * @Date 2019-12-04 19:22
 * @Version 1.0
 */
public class JavaCourseFactory implements IcourseFactory {

    @Override
    public Irecord getRecord() {
        return new JavaRecord();
    }

    @Override
    public INote getNote() {
        return new JavaNote();
    }
}
