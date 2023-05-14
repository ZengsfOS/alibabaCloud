package com.zengsf.order.controller;

import com.zengsf.order.feign.StockSAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StockSAO stockSAO;

    @GetMapping("/add")
    public String add(){
        System.out.println("下单成功！");

//        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        String msg = stockSAO.reduct();
        return "hello world" + msg;
    }
}
