package com.shgx.template.service;

import com.shgx.template.model.Order;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class AliPay extends PayTemplate{
    @Override
    void sendPayRequest(Order order) {
        order.setMethod("AliPay");
        order.setStatus("Level-1");
    }

    @Override
    void cashier(Order order) {
        // check password
        order.setStatus("Level-2");
    }

    @Override
    boolean payCore(Order order) {
        try{
            // DB request
            order.setStatus("finished");
            return true;
        }catch (Exception e){
            order.setStatus("unfinished");
            return false;
        }
    }
}
