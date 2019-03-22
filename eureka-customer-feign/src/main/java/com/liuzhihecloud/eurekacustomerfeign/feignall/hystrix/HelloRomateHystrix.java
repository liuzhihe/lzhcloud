package com.liuzhihecloud.eurekacustomerfeign.feignall.hystrix;

import com.liuzhihecloud.eurekacustomerfeign.feignall.HelloRomate;
import org.springframework.stereotype.Component;

/**
 * @ClassName: HelloRomateHystrix
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/22 18:23
 **/
@Component
public class HelloRomateHystrix implements HelloRomate {

    @Override
    public String hello(String name) {
        return "hello 熔断";
    }

    @Override
    public String helloMany(String age, String name) {
        return "helloMany 熔断";
    }
}
