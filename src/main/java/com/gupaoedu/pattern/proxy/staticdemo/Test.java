package com.gupaoedu.pattern.proxy.staticdemo;

/**
 * @ClassName Test
 * @Description 静态代理测试类
 * @Author yangting
 * @Date 2019/12/10 2:47 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
//        Father father = new Father(new Son());
//        father.findLove();
//        Order order = new Order();
//        order.setCreateTime(new Date());
//
//        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
//        orderService.createOrder(order);

        int a = -10;
        String binary = Integer.toBinaryString(a);
        char[] array = binary.toCharArray();
        int count = 0;
        for (char data:array){
            if(data == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
