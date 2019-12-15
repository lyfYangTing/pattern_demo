package com.gupaoedu.pattern.strategy.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PayStrategy
 * @Description 支付策略类
 * @Author yangting
 * @Date 2019/12/15 8:20 下午
 * @Version 1.0
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> map = new HashMap<>();

    static {
        map.put(ALI_PAY, new AliPay());
        map.put(JD_PAY, new JDPay());
        map.put(UNION_PAY, new UnionPay());
        map.put(WECHAT_PAY, new WechatPay());
    }

    public static Payment getInstance(String payKey) {
        Payment payment = map.get(payKey);
        return payment == null ? map.get(PayStrategy.DEFAULT_PAY) : payment;
    }

}
