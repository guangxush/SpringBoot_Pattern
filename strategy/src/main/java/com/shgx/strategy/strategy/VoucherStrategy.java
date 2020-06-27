package com.shgx.strategy.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class VoucherStrategy implements Strategy {

    private double voucher;

    @Override
    public double generatePrize(double price) {
        return price > voucher ? price - voucher : price;
    }

    public double getVoucher() {
        return voucher;
    }

    public void setVoucher(double voucher) {
        this.voucher = voucher;
    }
}
