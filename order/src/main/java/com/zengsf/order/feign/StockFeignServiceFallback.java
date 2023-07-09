package com.zengsf.order.feign;

import org.springframework.stereotype.Component;

@Component
public class StockFeignServiceFallback implements StockSAO{
    @Override
    public String reduct() {
        return "降级了！！！";
    }
}
