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

package com.muarine.example.action;

import com.muarine.example.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.muarine.example.action.IndexAction
 *
 * @author Muarine<maoyun0903@163.com>
 * @date 16/10/10
 * @since 1.0
 */
@RestController
public class IndexAction {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return hystrixService.add("prefix", "suffix");
    }

}
