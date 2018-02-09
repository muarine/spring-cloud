/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2017 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.provider.hello.dao;

import com.muarine.provider.hello.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author maoyun@rtmap.com
 * @project spring-cloud
 * @package com.muarine.provider.hello.dao
 * @date 2/8/18
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{



}
