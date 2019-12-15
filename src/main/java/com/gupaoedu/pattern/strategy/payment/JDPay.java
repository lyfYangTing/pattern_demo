package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName JDPay
 * @Description 京东支付
 * @Author yangting
 * @Date 2019/12/15 8:17 下午
 * @Version 1.0
 */
public class JDPay extends Payment{

    @Override
    protected String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 400;
    }
}
