package com.liuzhihecloud.eurekacustomerfeign.controller;

import com.liuzhihecloud.eurekacustomerfeign.feignall.HelloRomate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 17:51
 **/
@RestController
public class HomeController {

    @Autowired
    private HelloRomate helloRomate;

    @GetMapping("/hello")
    public String hello(){
        return helloRomate.hello("liuzhihe");
    }
}
