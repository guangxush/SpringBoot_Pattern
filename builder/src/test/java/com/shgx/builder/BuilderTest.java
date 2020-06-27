package com.shgx.builder;

import com.shgx.builder.model.Goods;
import com.shgx.builder.service.ShoppingCart;
import junit.framework.TestCase;
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
@SpringBootTest(classes = BuilderApplication.class)
public class BuilderTest extends TestCase {

    @Autowired
    private ShoppingCart shoppingCart;

    @Test
    public void testShop() {
        Goods goods = shoppingCart.buildAddress("Shang hai")
                .buildGoodsName("Computer")
                .buildPrice(12.57)
                .buildSale(true)
                .builder();
        System.out.println(goods.toString());
    }
}
