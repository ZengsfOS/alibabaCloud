package com.zengsf.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "stock-service", path = "/stock", fallback = StockFeignServiceFallback.class)
public interface StockSAO {

    @GetMapping("/reduct")
    String reduct();
}
