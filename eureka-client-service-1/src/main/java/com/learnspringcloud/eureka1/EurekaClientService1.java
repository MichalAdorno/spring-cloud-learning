package com.learnspringcloud.eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientService1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientService1.class, args);
    }

}
