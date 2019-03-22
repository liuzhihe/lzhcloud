package com.liuzhihecloud.eurekacustomerfeign.feignall;

import com.liuzhihecloud.eurekacustomerfeign.feignall.hystrix.HelloRomateHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloRomate
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 17:54
 **/
@FeignClient(name="EUREKA-PRODUCT",fallback = HelloRomateHystrix.class)
@Component
public interface HelloRomate {
    @GetMapping("/hello")
    String hello(@RequestParam(value="name") String name);

    @GetMapping("/helloManyPar")
    String helloMany(@RequestParam(value = "age") String age,@RequestParam(value = "name") String name);
}
