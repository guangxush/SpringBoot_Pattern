package com.shgx.factory.factory;

import com.shgx.factory.FactoryApplication;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FactoryApplication.class)
public class CampaignTest extends TestCase {

    @Autowired
    private Campaign campaign;

    @Test
    public void testPrice() {
        double price = campaign.generatePrice("discount", 12.00);
        System.out.println("discount price: " + price);
        price = campaign.generatePrice("random", 12.00);
        System.out.println("random price: " + price);
        price = campaign.generatePrice("reduce", 12.00);
        System.out.println("reduce price: " + price);
        Assert.assertNotNull(price);
    }
}