package com.muarine.dao;

import com.muarine.example.Application;
import com.muarine.example.orm.ShakeUser;
import com.muarine.example.orm.ShakeUserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * com.muarine.dao.TestDao
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/10/8
 * @since 1.0
 */
@SuppressWarnings("ALL")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TestDao {

    @Autowired
    private ShakeUserMapper shakeUserMapper;


    @Before
    public void setUp(){
        // 前置工作

    }

    @Test
    public void testCreate(){

        ShakeUser shakeUser = shakeUserMapper.selectById(1L);


    }

}
