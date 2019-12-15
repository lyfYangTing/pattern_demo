package com.gupaoedu.pattern.strategy.promotion;

/**
 * @ClassName PromotionTest
 * @Description 促销活动测试类
 * @Author yangting
 * @Date 2019/12/15 6:49 下午
 * @Version 1.0
 */
public class PromotionTest {


    public static void main(String[] args) {
        PromotionTest.activity("empty");
    }


    public void simple(){
        PromotionActivity groupBuyActivity = new PromotionActivity(new GroupBuyStrategy());
        PromotionActivity emptyActivity = new PromotionActivity(new EmptyStrategy());

        groupBuyActivity.command();
        emptyActivity.command();
    }

    public static void activity(Class<? extends PromotionStrategy> clazz){
        PromotionStrategy strategy = null;
        try {
            strategy = (PromotionStrategy) clazz.newInstance();
            strategy.doPromotion();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void activity(String promotionKey){
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getStrategyInstance(promotionKey));
        activity.command();
    }

}
