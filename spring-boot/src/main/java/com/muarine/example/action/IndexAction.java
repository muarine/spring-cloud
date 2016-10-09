/*
 *
 *  *
 *  *  * RT MAP, Home of Professional MAP
 *  *  * Copyright 2016 Bit Main Inc. and/or its affiliates and other contributors
 *  *  * as indicated by the @author tags. All rights reserved.
 *  *  * See the copyright.txt in the distribution for a
 *  *  * full listing of individual contributors.
 *  *
 *
 */

package com.muarine.example.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * com.muarine.example.action.IndexAction
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/7/11
 * @since 1.0
 */
@RestController
@RequestMapping("/index")
public class IndexAction {

    Logger LOGGER = LoggerFactory.getLogger(IndexAction.class);

    @RequestMapping("/index")
    public Map<String,Object> index(){

        Map<String,Object> map = new HashMap<>(2);
        map.put("message","this is a interface return message.");

        return map;
    }


    @RequestMapping(value="/user", method= RequestMethod.POST)
    public String postUser(String uid) {


        LOGGER.debug("uid:{}" , uid);
        LOGGER.info("uid:{}" , uid);

        return "success";
    }

    @RequestMapping(value="/user/{id}", method= RequestMethod.POST)
    public String get(@PathVariable  Long id) {

        return "success";
    }



}
