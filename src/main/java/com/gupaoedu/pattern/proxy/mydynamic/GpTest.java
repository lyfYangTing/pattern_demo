package com.gupaoedu.pattern.proxy.mydynamic;

import com.gupaoedu.pattern.proxy.staticdemo.IOrderService;
import com.gupaoedu.pattern.proxy.staticdemo.Order;
import com.gupaoedu.pattern.proxy.staticdemo.OrderService;

import java.util.Date;

/**
 * @ClassName GpTest
 * @Description
 * @Author yangting
 * @Date 2019/12/12 2:51 下午
 * @Version 1.0
 */
public class GpTest {


    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date());
        IOrderService orderService = (IOrderService) new OrderServiceGpProxy().getInstance(new OrderService());
        orderService.createOrder(order);
    }
}
