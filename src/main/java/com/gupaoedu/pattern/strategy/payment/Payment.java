package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName Payment 支付渠道
 * @Description 定义支付规范和支付逻辑
 * @Author yangting
 * @Date 2019/12/15 7:23 下午
 * @Version 1.0
 */
public abstract class Payment {

    /**
     * 支付方式名称
     */
    abstract String getName();


    /**
     * 查询余额
     * @param uid
     */
    abstract double queryBalance(String uid);


    public PayState pay(String uid,double money){
        if(this.queryBalance(uid) > money){
            return new PayState(200,"支付成功","支付金额:" + money);
        } else {
            return new PayState(500,"支付失败","余额不足");
        }
    }
}
