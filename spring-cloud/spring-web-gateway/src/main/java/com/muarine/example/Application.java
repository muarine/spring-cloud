/*
 * Copyright 2014-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.muarine.example;

import com.muarine.example.filter.AccessTokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * com.muarine.example.Application
 *
 * SpringCloudApplication 整合了 @SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker，
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/7/11
 * @since 1.0
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {

    @Bean
    public AccessTokenFilter accessTokenFilter(){
        return new AccessTokenFilter();
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
