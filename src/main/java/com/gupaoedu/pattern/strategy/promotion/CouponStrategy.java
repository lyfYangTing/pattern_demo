package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName CouponStrategy
 * @Description 优惠券抵扣策略
 * @Author yangting
 * @Date 2019/12/15 6:41 下午
 * @Version 1.0
 */
public class CouponStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
