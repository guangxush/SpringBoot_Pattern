package com.shgx.strategy.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/06/27
 */
@Service
public class MemberStrategy implements Strategy{

    private boolean member;

    private double point;

    @Override
    public double generatePrize(double price) {
        return member ? price - point : price;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
