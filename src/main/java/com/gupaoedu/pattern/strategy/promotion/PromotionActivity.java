package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName PromotionActivity
 * @Description 促销活动方案
 * @Author yangting
 * @Date 2019/12/15 6:47 下午
 * @Version 1.0
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void command(){
        promotionStrategy.doPromotion();
    }
}
