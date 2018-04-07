package com.example.springboot.controller;

import com.example.springboot.util.WebProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {
    @Autowired
    private WebProperties webProperties;


    @Test
    public void getHello() throws Exception {
        System.out.println(webProperties.getTitle());
        Assert.assertEquals(webProperties.getTitle(), "mydear");
        Assert.assertEquals(webProperties.getDescription(), "yoursoul");
    }


    @Test
    public void testMap() throws Exception {
        Map<String, Long> orderMinTime=new HashMap<String, Long>();
        boolean xx=orderMinTime.isEmpty();
    }
}
