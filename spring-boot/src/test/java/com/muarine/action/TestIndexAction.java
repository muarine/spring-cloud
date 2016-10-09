package com.muarine.action;

import com.muarine.example.action.IndexAction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * com.muarine.action.TestIndexAction
 *
 * @author Muarine<maoyun@rtmap.com>
 * @date 16/10/8
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class TestIndexAction {

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new IndexAction()).build();
    }

    @Test
    public void testIndex() throws Exception {

        RequestBuilder request = post("/index/user")
                .param("uid" , "1")
                .param("name" , "zhangsan");

        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));
//                .andExpect(content().string(equalTo("[]")));

    }

}
