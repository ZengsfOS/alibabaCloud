package com.zengsf.stock.controller;


import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/reduct")
    public String reduct(){
//        Assert.isTrue(false, "报错");
        System.out.println("扣减库存");
        return "扣减库存+8011";
    }
}
