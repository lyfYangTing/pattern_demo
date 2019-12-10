package com.gupaoedu.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Description
 * @Author yangting
 * @Date 2019/12/6 8:27 下午
 * @Version 1.0
 * 容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的。
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> map = new ConcurrentHashMap<String, Object>();

    private static Object getBean(String className){
        synchronized (map){
            if(!map.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className);
                    map.put(className,obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return map.get(className);
            }
        }
    }
}
