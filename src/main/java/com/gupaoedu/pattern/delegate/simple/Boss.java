package com.gupaoedu.pattern.delegate.simple;

/**
 * @ClassName Boss
 * @Description 老板
 * @Author yangting
 * @Date 2019/12/14 8:40 下午
 * @Version 1.0
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
