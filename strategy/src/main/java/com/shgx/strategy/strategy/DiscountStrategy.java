package com.shgx.strategy.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class DiscountStrategy implements Strategy {

    private double discount = 0.97;
    private double thresholdPrice = 100;

    @Override
    public double generatePrize(double price) {
        return price > thresholdPrice ? price * discount : price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getThresholdPrice() {
        return thresholdPrice;
    }

    public void setThresholdPrice(double thresholdPrice) {
        this.thresholdPrice = thresholdPrice;
    }
}
