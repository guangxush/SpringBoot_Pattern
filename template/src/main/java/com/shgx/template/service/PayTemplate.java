package com.shgx.template.service;

import com.shgx.template.model.Order;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
public abstract class PayTemplate {

    /**
     * 发起支付请求
     */
    abstract void sendPayRequest(Order order);

    /**
     * 拉起收银台
     */
    abstract void cashier(Order order);

    /**
     * 完成支付
     */
    abstract boolean payCore(Order order);


    /**
     * 支付流程
     */
    public final void pay(Order order){
        sendPayRequest(order);
        cashier(order);
        payCore(order);
    }
}
