package com.zengsf.order.controller;

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

    @GetMapping("/add")
    public String add(){
        System.out.println("下单成功！");

        String msg = restTemplate.getForObject("http://localhost:8011/stock/reduct", String.class);
        return "hello world" + msg;
    }
}
