package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName OrderService
 * @Description 订单业务实现类:目标类
 * 使用静态代理，主要完成的功能是:
 * 根据订单创建时间自动按年进行分库。
 * 根据开闭原则，原来写好的逻辑我们不去修改，通过代理对象来完成。
 * 先创建数据源路由对象，我们使用ThreadLocal的单例实现，DynamicDataSourceEntry 类:
 * @Author yangting
 * @Date 2019/12/10 3:00 下午
 * @Version 1.0
 */
public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService() {
        //如果使用 Spring 应该是自动注入的
        //我们为了使用方便，在构造方法中将 orderDao 直接初始化了 orderDao = new OrderDao();
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }
}
