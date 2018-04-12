package com.example.springboot.rabbitmq;

import com.example.springboot.rabbitmq.many.TestSender1;
import com.example.springboot.rabbitmq.many.TestSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    private TestSender1 testSender1;

    @Autowired
    private TestSender2 testSender2;

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            testSender1.send(i);
        }
    }

    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            testSender1.send(i);
            testSender2.send(i);
        }
    }
}
