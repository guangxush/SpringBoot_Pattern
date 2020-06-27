package com.shgx.builder.service;

import com.shgx.builder.model.Goods;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class ShoppingCart implements Builder{

    private Goods goods = new Goods();

    @Override
    public Goods builder(){
        return this.goods;
    }

    @Override
    public Builder buildAdvertisement(String advertisement) {
        goods.setAdvertisement(advertisement);
        return this;
    }

    @Override
    public Builder buildGoodsName(String goodsName) {
        goods.setGoodsName(goodsName);
        return this;
    }

    @Override
    public Builder buildPrice(double price) {
        goods.setPrice(price);
        return this;
    }

    @Override
    public Builder buildAmount(int amount) {
        goods.setAmount(amount);
        return this;
    }

    @Override
    public Builder buildSale(boolean sale) {
        goods.setSale(sale);
        return this;
    }

    @Override
    public Builder buildAddress(String address) {
        goods.setAddress(address);
        return this;
    }

    @Override
    public Builder buildMerchant(String merchant) {
        goods.setMerchant(merchant);
        return this;
    }

    @Override
    public Builder buildBuyer(String buyer) {
        goods.setBuyer(buyer);
        return this;
    }
}
