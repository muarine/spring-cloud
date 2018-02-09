/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2017 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.provider.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maoyun@rtmap.com
 * @project spring-cloud
 * @package com.muarine.provider.hello
 * @date 2/8/18
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HelloProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloProviderApplication.class, args);

    }

}
