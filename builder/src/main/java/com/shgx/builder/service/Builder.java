package com.shgx.builder.service;

import com.shgx.builder.model.Goods;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
public interface Builder {
    Builder buildAdvertisement(String advertisement);

    Builder buildGoodsName(String goodsName);

    Builder buildPrice(double price);

    Builder buildAmount(int amount);

    Builder buildSale(boolean sale);

    Builder buildAddress(String address);

    Builder buildMerchant(String merchant);

    Builder buildBuyer(String buyer);

    Goods builder();
}
