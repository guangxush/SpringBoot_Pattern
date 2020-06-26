package com.shgx.factory.service;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/26
 */
@Service
public class DiscountRule extends Rule {

    private double discountRate = 1.00;

    @Override
    protected double play(double price) {
        return price * discountRate > price ? price : price * discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
