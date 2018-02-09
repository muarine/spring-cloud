/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2017 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.consumer.feign.hello.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author maoyun@rtmap.com
 * @project spring-cloud
 * @package com.muarine.consumer.feign.hello.entity
 * @date 2/9/18
 */
@Setter
@Getter
@ToString
public class User {

    private Long id;
    private String username;
    private Integer age;

}
