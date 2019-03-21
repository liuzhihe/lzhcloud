package com.liuzhihecloud.eurekacustomerfeign.feignall;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloRomate
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 17:54
 **/
@FeignClient(name="EUREKA-PRODUCT")
public interface HelloRomate {
    @GetMapping("/hello")
    String hello(@RequestParam(value="name") String name);
}
