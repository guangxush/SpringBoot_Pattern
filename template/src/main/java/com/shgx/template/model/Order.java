package com.shgx.template.model;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
public class Order {
    String uuId;
    String payerId;
    String payeeId;
    double price;
    String status;
    String method;

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uuId='" + uuId + '\'' +
                ", payerId='" + payerId + '\'' +
                ", payeeId='" + payeeId + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
