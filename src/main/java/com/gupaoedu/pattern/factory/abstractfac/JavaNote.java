package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName JavaNote
 * @Description Java笔记
 * @Author yangting
 * @Date 2019-12-04 21:13
 * @Version 1.0
 */
public class JavaNote implements INote {

    @Override
    public void note() {
        System.out.println("JAVA笔记");
    }
}
