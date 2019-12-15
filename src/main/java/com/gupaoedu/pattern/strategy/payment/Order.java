package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName Order
 * @Description 订单类
 * @Author yangting
 * @Date 2019/12/15 8:27 下午
 * @Version 1.0
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //完美地解决了 switch 的过程，不需要在代码逻辑中写 switch 了
    // 更不需要写 if else if
    public PayState pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }


    public PayState pay(String payKey) {
        Payment payment = PayStrategy.getInstance(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为:" + amount + "，开始扣款...");
        return payment.pay(uid, amount);
    }
}
