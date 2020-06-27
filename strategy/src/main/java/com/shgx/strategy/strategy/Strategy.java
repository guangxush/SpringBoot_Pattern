package com.shgx.strategy.strategy;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
public interface Strategy {
    /**
     * 促销策略
     * @param price
     * @return
     */
    double generatePrize(double price);
}
