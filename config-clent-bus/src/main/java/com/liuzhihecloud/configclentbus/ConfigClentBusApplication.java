package com.liuzhihecloud.configclentbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClentBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClentBusApplication.class, args);
    }

}
