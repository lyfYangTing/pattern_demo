package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName EmptyStrategy
 * @Description 无优惠
 * @Author yangting
 * @Date 2019/12/15 6:46 下午
 * @Version 1.0
 */
public class EmptyStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
