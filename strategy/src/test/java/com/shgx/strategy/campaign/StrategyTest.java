package com.shgx.strategy.campaign;

import com.shgx.strategy.StrategyApplication;
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
@SpringBootTest(classes = StrategyApplication.class)
public class StrategyTest extends TestCase {

    @Autowired
    private Sale sale;

    @Test
    public void testPrice() {
        double price = 150;
        // 传入策略参数，选择合适的定价策略
        String playOne = "0,1,2,3";
        double discountPrice = sale.play(price, playOne);
        System.out.println("discount: "+ discountPrice);
        Assert.assertTrue(discountPrice <= price);

        String playTwo = "1,2";
        discountPrice = sale.play(price, playTwo);
        System.out.println("discount: "+ discountPrice);
        Assert.assertTrue(discountPrice <= price);
    }
}
