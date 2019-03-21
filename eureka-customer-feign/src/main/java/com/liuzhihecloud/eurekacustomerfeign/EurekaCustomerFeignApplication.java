package com.liuzhihecloud.eurekacustomerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaCustomerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomerFeignApplication.class, args);
    }

}
