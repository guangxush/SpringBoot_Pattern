package com.shgx.strategy.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class ReduceStrategy implements Strategy {

    private double threshold = 10.00;
    private double reducePrice = 2.00;

    @Override
    public double generatePrize(double price) {
        return price > threshold ? price - threshold : price;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(double reducePrice) {
        this.reducePrice = reducePrice;
    }
}
