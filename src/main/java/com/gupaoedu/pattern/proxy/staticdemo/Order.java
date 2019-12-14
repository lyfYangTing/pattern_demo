package com.gupaoedu.pattern.proxy.staticdemo;

import java.util.Date;

/**
 * @ClassName Order
 * @Description 订单实体
 * @Author yangting
 * @Date 2019/12/10 2:56 下午
 * @Version 1.0
 */
public class Order {

    private Object orderInfo;
    private Date createTime;
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
