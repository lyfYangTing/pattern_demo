package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName WechatPay
 * @Description 微信支付
 * @Author yangting
 * @Date 2019/12/15 8:18 下午
 * @Version 1.0
 */
public class WechatPay extends Payment {

    @Override
    protected String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
