package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName PythonNote
 * @Description Python笔记
 * @Author yangting
 * @Date 2019-12-04 21:13
 * @Version 1.0
 */
public class PythonNote implements INote {

    @Override
    public void note() {
        System.out.println("Python笔记");
    }
}
