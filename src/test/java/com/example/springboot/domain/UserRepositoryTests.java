package com.example.springboot.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userRepository.deleteAll();
        userRepository.saveAndFlush(new User("aa@126.com", "aa1", "aa123456", "aa",formattedDate));
        userRepository.saveAndFlush(new User("bb@126.com", "bb2", "bb123456", "bb",formattedDate));
        userRepository.saveAndFlush(new User("cc@126.com", "cc3", "bb123456", "cc",formattedDate));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("cc3", userRepository.findByUserNameOrEmail("cc", "cc@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("cc"));

    }
}
