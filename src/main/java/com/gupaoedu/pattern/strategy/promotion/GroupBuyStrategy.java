package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName GroupbuyStrategy
 * @Description 拼团优惠
 * @Author yangting
 * @Date 2019/12/15 6:44 下午
 * @Version 1.0
 */
public class GroupBuyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
