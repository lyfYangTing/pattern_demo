package com.gupaoedu.pattern.factory.abstractfac;


/**
 * @ClassName PythonCourseFactory
 * @Description Python课程
 * @Author yangting
 * @Date 2019-12-04 19:22
 * @Version 1.0
 */
public class PythonCourseFactory implements IcourseFactory {

    @Override
    public Irecord getRecord() {
        return new PythonRecord();
    }

    @Override
    public INote getNote() {
        return new PythonNote();
    }
}
