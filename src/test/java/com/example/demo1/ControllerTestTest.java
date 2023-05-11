package com.example.demo1;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ControllerTest.class)
public class ControllerTestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {

        String name = "Sofia";

        mockMvc.perform(MockMvcRequestBuilders.get("/hello").param("name", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello Sofia!"));
    }
}
