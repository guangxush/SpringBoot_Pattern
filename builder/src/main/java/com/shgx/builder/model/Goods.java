package com.shgx.builder.model;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
public class Goods {
    private String advertisement;
    private String goodsName;
    private double price;
    private int amount;
    private boolean sale;
    private String address;
    private String merchant;
    private String buyer;

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "advertisement='" + advertisement + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", sale=" + sale +
                ", address='" + address + '\'' +
                ", merchant='" + merchant + '\'' +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}
