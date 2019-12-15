package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName UnionPay
 * @Description 银联支付
 * @Author yangting
 * @Date 2019/12/15 8:19 下午
 * @Version 1.0
 */
public class UnionPay extends Payment {

    @Override
    protected String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100;
    }
}
