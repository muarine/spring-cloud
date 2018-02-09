/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2017 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.consumer.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author maoyun@rtmap.com
 * @project spring-cloud
 * @package com.muarine.consumer.feign.hystrix
 * @date 2/9/18
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class HelloFeignHystrixApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloFeignHystrixApplication.class, args);
    }

}
