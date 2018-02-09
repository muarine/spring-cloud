/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2017 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.consumer.feign.hello.controller;

import com.muarine.consumer.feign.hello.entity.User;
import com.muarine.consumer.feign.hello.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maoyun@rtmap.com
 * @project spring-cloud
 * @package com.muarine.consumer.feign.hello.controller
 * @date 2/9/18
 */
@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }

}
