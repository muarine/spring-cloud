/*
 * RT MAP, Home of Professional MAP
 * Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */

package com.muarine.example.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.muarine.example.service.HystrixService
 *
 * @author Muarine<maoyun0903@163.com>
 * @date 16/10/10
 * @since 1.0
 */
@Component
public class HystrixServiceImpl implements HystrixService{


    @Override
    public String add(@RequestParam(value = "prefix") String prefix,@RequestParam(value = "suffix") String suffix) {
        return "-9999";
    }
}
