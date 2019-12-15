package com.gupaoedu.pattern.delegate.simple;

/**
 * @ClassName DataBaseEmployee
 * @Description 数据库开发人员
 * @Author yangting
 * @Date 2019/12/14 9:19 下午
 * @Version 1.0
 */
public class DataBaseEmployee implements IEmployee{

    @Override
    public void doing(String command) {
        System.out.println("开始执行" + command + "任务！");
    }
}
