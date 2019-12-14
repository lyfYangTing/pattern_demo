package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName OrderDao
 * @Description 订单数据库 持久层操作类
 * @Author yangting
 * @Date 2019/12/10 2:57 下午
 * @Version 1.0
 */
public class OrderDao {


    public int insert(Order order){
        System.out.println("OrderDao 创建 Order 成功!");
        return 1;
    }
}
