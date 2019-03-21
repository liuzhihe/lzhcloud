package com.liuzhihecloud.eurekaproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProductApplication.class, args);
    }

}
