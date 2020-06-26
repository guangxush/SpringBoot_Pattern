package com.shgx.factory.service;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/26
 */
@Service
public class RandomRule extends Rule {

    private double threshPrice;

    @Override
    protected double play(double price) {
        return price > threshPrice ? price - threshPrice : price;
    }

    public double getThreshPrice() {
        return threshPrice;
    }

    public void setThreshPrice(double threshPrice) {
        this.threshPrice = threshPrice;
    }
}
