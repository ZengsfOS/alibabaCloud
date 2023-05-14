package com.zengsf.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.zengsf.ribbon.rule.CustomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRandomRuleConfig {

    // 方法名一定要叫iRule
    @Bean
    public IRule iRule(){
        return new CustomRule();
    }
}
