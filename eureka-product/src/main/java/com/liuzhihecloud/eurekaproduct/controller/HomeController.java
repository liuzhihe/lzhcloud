package com.liuzhihecloud.eurekaproduct.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 14:23
 **/
@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        logger.info(name);
        return "product: hello" + " " + name + " " + new Date();
    }
    @GetMapping("/helloManyPar")
    public String helloManyPar(@RequestParam String name,String age){
        logger.info(name);
        return "product: hello" + " " + name + " <<<<" + age + new Date();
    }
}
