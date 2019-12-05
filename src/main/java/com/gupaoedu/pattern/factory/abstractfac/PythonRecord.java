package com.gupaoedu.pattern.factory.abstractfac;

/**
 * @ClassName PythonRecord
 * @Description Python录播视频
 * @Author yangting
 * @Date 2019-12-04 21:10
 * @Version 1.0
 */
public class PythonRecord implements Irecord {

    @Override
    public void record() {
        System.out.println("Python录播视频");
    }
}
