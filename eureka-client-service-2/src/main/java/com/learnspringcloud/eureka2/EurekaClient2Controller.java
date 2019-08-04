package com.learnspringcloud.eureka2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EurekaClient2Controller {

    @Value("${composers}")
    private List<String> composers;

    @GetMapping("/composer")
    public List<String> getComposers() {
        return composers;
    }


}