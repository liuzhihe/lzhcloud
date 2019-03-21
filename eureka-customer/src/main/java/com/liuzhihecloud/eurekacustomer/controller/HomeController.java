package com.liuzhihecloud.eurekacustomer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 14:48
 **/
@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient client;

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        ServiceInstance serviceInstance = client.choose("eureka-product");
        String url ="http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=liuzhihe";
        logger.info(url);
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }

    @GetMapping("/helloRibbon")
    public String helloRibbon(@RequestParam String name){
        String url ="http://EUREKA-PRODUCT/hello?name=liuzhihe";
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }
}
