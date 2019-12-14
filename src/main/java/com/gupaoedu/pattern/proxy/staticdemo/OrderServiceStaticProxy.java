package com.gupaoedu.pattern.proxy.staticdemo;

import java.text.SimpleDateFormat;

/**
 * @ClassName OrderServiceStaticProxy
 * @Description 切换数据源的代理类
 * @Author yangting
 * @Date 2019/12/10 3:27 下午
 * @Version 1.0
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        int dbRouter = Integer.parseInt(format.format(order.getCreateTime()));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
        int result = orderService.createOrder(order);
        after();
        return result;
    }

    private void before(){
        System.out.println("Proxy before method.");
    }

    private void after(){
        System.out.println("Proxy after method.");
    }
}
