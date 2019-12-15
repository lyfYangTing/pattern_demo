package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName AliPay
 * @Description 支付宝支付
 * @Author yangting
 * @Date 2019/12/15 8:16 下午
 * @Version 1.0
 */
public class AliPay extends Payment {

    @Override
    protected String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
