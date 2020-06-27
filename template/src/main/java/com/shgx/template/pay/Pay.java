package com.shgx.template.pay;

import com.shgx.template.model.Order;
import com.shgx.template.service.AliPay;
import com.shgx.template.service.PayTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class Pay {
    @Autowired
    private AliPay aliPay;

    public void pay(Order order) {
        // create order
        aliPay.pay(order);
        System.out.println(order);
        // do something
    }
}
