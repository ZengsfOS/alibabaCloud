package com.zengsf.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zengsf.order.feign.StockSAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StockSAO stockSAO;

    @GetMapping("/add")
    @SentinelResource(value = "add", blockHandler = "addBlockHandler")
    public String add(){
        System.out.println("下单成功！");

//        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        String msg = stockSAO.reduct();
        return "hello world" + msg ;
    }

    public String addBlockHandler(BlockException e){
        return "流控！";
    }
}
