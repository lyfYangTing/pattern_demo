package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName CashbackStrategy
 * @Description 返现促销策略
 * @Author yangting
 * @Date 2019/12/15 6:44 下午
 * @Version 1.0
 */
public class CashBackStrategy implements PromotionStrategy{


    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
