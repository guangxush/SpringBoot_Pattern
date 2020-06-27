package com.shgx.template;

import com.shgx.template.model.Order;
import com.shgx.template.pay.Pay;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateApplication.class)
public class PayTest extends TestCase {

    @Autowired
    private Pay pay;

    @Test
    public void testPay() {
        Order order = new Order();
        order.setStatus("start");
        order.setPayeeId("0123");
        order.setPayerId("0124");
        order.setPrice(12.34);
        pay.pay(order);
    }
}
