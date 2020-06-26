package com.shgx.factory.service;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/26
 */
@Service
public class ReduceRule extends Rule{

    private double minNumber = 0.9;
    private double maxNumber = 1.0;

    @Override
    public double play(double price) {
        return price * randomBetween(minNumber, maxNumber);
    }

    private double randomBetween(double minNumber, double maxNumber)
    {
        double diff = maxNumber - minNumber;
        return ((Math.random()) * diff) + minNumber;
    }

    public double getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(double minNumber) {
        this.minNumber = minNumber;
    }

    public double getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(double maxNumber) {
        this.maxNumber = maxNumber;
    }
}
