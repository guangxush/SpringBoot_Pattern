package com.shgx.strategy.campaign;

import com.shgx.strategy.strategy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Component
public class Sale {
    private List<Strategy> strategies = new ArrayList<>();

    @Autowired
    private DiscountStrategy discountStrategy;

    @Autowired
    private MemberStrategy memberStrategy;

    @Autowired
    private ReduceStrategy reduceStrategy;

    @Autowired
    private VoucherStrategy voucherStrategy;

    /**
     * 组装策略
     */
    @PostConstruct
    private void CampaignStrategy(){
        discountStrategy.setDiscount(0.97);
        discountStrategy.setThresholdPrice(10);
        strategies.add(discountStrategy);
        memberStrategy.setMember(true);
        memberStrategy.setPoint(10);
        strategies.add(memberStrategy);
        reduceStrategy.setReducePrice(2);
        reduceStrategy.setThreshold(5);
        strategies.add(reduceStrategy);
        voucherStrategy.setVoucher(5);
        strategies.add(voucherStrategy);
    }

    /**
     * 策略模式，调用具体的策略执行
     * @param price
     * @param param
     * @return
     */
    public double play(double price, String param){
        String[] paramArray = param.split(",");
        if(paramArray.length<=0){
            return price;
        }
        for(String index : paramArray){
            price = (strategies.get(Integer.parseInt(index)).generatePrize(price));
        }
        BigDecimal b = new BigDecimal(price);
        double result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }
}
