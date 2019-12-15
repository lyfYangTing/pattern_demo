package com.gupaoedu.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leader
 * @Description 部门领导
 * @Author yangting
 * @Date 2019/12/14 8:42 下午
 * @Version 1.0
 */
public class Leader implements IEmployee {

    private static Map<String,IEmployee> map = new HashMap<>();

    static {
        map.put("netty",new NettyEmployee());
        map.put("java",new JavaEmployee());
        map.put("database",new DataBaseEmployee());
    }

    /**
     * 领导分配工作
     * @param command
     */
    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }
}
