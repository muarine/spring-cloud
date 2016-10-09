/*
 * RT MAP, Home of Professional MAP
 * Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */

package com.muarine.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * com.muarine.example.Application
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/7/11
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String home() {
        String s = restTemplate.getForEntity("http://COMPUTE-SERVICE/", String.class).getBody();
        System.out.println("远程请求结果:" + s);
        return s;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
