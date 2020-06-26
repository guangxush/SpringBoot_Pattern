package com.shgx.factory.factory;

import com.shgx.factory.service.DiscountRule;
import com.shgx.factory.service.RandomRule;
import com.shgx.factory.service.ReduceRule;
import com.shgx.factory.service.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


/**
 * @author: guangxush
 * @create: 2020/06/26
 */
@Component
public class RuleFactory {

    private Map<String, Rule> map = new HashMap<>();

    @Autowired
    private DiscountRule discountRule;

    @Autowired
    private ReduceRule reduceRule;

    @Autowired
    private RandomRule randomRule;

    @PostConstruct
    private void generateFactory() {
        discountRule.setDiscountRate(0.95);
        map.put("discount", discountRule);
        randomRule.setThreshPrice(1.00);
        map.put("reduce", randomRule);
        reduceRule.setMinNumber(0.95);
        reduceRule.setMaxNumber(0.99);
        map.put("random", reduceRule);
    }

    public Rule fetchRule(String name) {
        return map.get(name);
    }
}
