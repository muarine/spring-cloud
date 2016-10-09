/*
    RT MAP, Home of Professional MAP
    Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
    as indicated by the @author tags. All rights reserved.
    See the copyright.txt in the distribution for a
    full listing of individual contributors.
*/

package com.muarine.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.muarine.example.Application
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/7/11
 * @since 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).web(true).run(args);

    }

}
