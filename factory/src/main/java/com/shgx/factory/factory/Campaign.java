package com.shgx.factory.factory;

import com.shgx.factory.service.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: guangxush
 * @create: 2020/06/26
 */
@Service
public class Campaign {
    public double price;
    public String ruleName;

    @Autowired
    private RuleFactory ruleFactory;

    public double generatePrice(String ruleName, double price) {
        Rule rule = ruleFactory.fetchRule(ruleName);
        BigDecimal b = new BigDecimal(rule.play(price));
        double result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
