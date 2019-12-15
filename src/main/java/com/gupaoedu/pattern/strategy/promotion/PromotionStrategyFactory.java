package com.gupaoedu.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Description 促销策略工厂
 * @Author yangting
 * @Date 2019/12/15 7:00 下午
 * @Version 1.0
 */
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put("empty",new EmptyStrategy());
        strategyMap.put("cashBack",new CashBackStrategy());
        strategyMap.put("coupon",new CouponStrategy());
        strategyMap.put("groupBuy",new GroupBuyStrategy());
    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getStrategyInstance(String promotionKey){
        PromotionStrategy strategy = strategyMap.get(promotionKey);
        return strategy==null ? strategyMap.get("empty") : strategy;
    }

}
