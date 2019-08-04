package com.learnspringcloud.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientService2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientService2.class, args);
    }

}
