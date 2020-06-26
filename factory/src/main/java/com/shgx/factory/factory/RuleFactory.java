package com.shgx.factory.factory;

import com.shgx.factory.service.DiscountRule;
import com.shgx.factory.service.RandomRule;
import com.shgx.factory.service.ReduceRule;
import com.shgx.factory.service.Rule;
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

    @PostConstruct
    private void generateFactory(){
        map.put("discount", new DiscountRule());
        map.put("reduce", new ReduceRule());
        map.put("random", new RandomRule());
    }

    public Rule fetchRule(String name) {
        return map.get(name);
    }
}
