package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName DynamicDataSourceEntry
 * @Description 动态切换数据源
 * @Author yangting
 * @Date 2019/12/10 3:03 下午
 * @Version 1.0
 */
public class DynamicDataSourceEntry {

    private DynamicDataSourceEntry(){}

    // 默认数据源
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    /**
     * 清空数据源
     */
    public void clear(){
        local.remove();
    }

    /**
     * 获取当前正在使用的数据源名字 *
     * @return String
     */
    public static String get(){
        return local.get();
    }

    /**
     * 还原当前切面的数据源 */
    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    /**
     * 设置已知名字的数据源 *
     * @param source
     */
    public static void set(String source) {
        local.set(source);
    }

    /**
     * 根据年份动态设置数据源
     * @param year
     */
    public static void set(int year){
        local.set("DB_" + year);
    }
}
