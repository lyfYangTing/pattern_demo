package com.gupaoedu.pattern.strategy.payment;

/**
 * @ClassName PayState
 * @Description 支付状态
 * @Author yangting
 * @Date 2019/12/15 8:11 下午
 * @Version 1.0
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态:[" + code + "]," + msg + ",交易详情:" + data);
    }
}
