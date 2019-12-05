package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName JavaRecord
 * @Description Java录播视频
 * @Author yangting
 * @Date 2019-12-04 21:10
 * @Version 1.0
 */
public class JavaRecord implements Irecord {

    @Override
    public void record() {
        System.out.println("JAVA录播视频");
    }
}
