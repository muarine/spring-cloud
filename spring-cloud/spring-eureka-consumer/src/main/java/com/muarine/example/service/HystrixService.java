/*
 * RT MAP, Home of Professional MAP
 * Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */

package com.muarine.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * com.muarine.example.service.HystrixService
 *
 * @author Muarine<maoyun0903@163.com>
 * @date 16/10/10
 * @since 1.0
 */
@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "computeServiceFailBack")
    public String computeService(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/link?prefix=AAA&suffix=BBB", String.class).getBody();
    }

    public String computeServiceFailBack(){
        return "服务消费失败. error";
    }
}
