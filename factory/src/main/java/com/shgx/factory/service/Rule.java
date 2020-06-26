package com.shgx.factory.service;

/**
 * @author: guangxush
 * @create: 2020/06/26
 */
public abstract class Rule {
    protected String name;
    protected String code;

    /**
     * 规则玩法
     * @return
     */
    public abstract double play(double price);

}
