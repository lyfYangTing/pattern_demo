package com.gupaoedu.pattern.proxy.dynamic.jdkproxy;

import com.gupaoedu.pattern.proxy.staticdemo.IOrderService;
import com.gupaoedu.pattern.proxy.staticdemo.Order;
import com.gupaoedu.pattern.proxy.staticdemo.OrderService;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * @ClassName Test
 * @Description 动态代理 测试
 * @Author yangting
 * @Date 2019/12/10 4:17 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
//        Person person = (Person) new JDKMeipo().getInstance(new Customer());
//        person.findLove();
        Order order = new Order();
        order.setCreateTime(new Date());
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService.createOrder(order);

        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IOrderService.class});
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("/Users/yangting/java/githubProject/pattern/$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
