package com.liuzhihecloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/23 11:38
 **/
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String profile;

    @GetMapping("/hello")
    public String hello(){
        return  profile;
    }
}
