/*
 * RT MAP, Home of Professional MAP
 * Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */

package com.muarine.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.muarine.example.service.HystrixService
 *
 * @author Muarine<maoyun0903@163.com>
 * @date 16/10/10
 * @since 1.0
 */
@FeignClient(value = "compute-service", fallback = HystrixServiceImpl.class)
public interface HystrixService {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    String add(@RequestParam("prefix") String prefix, @RequestParam("suffix") String suffix);


}
