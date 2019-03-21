package com.liuzhihecloud.eurekacustomer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: EuConfigure
 * @Description: TODO
 * @Author: ZhiHe Liu
 * @Date: 2019/3/21 14:51
 **/
@Configuration
public class EuConfigure {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
