package com.ciel.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.autocinfigure.ExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: CIEL
 * @Date: 2020/5/8 15:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class starterTest {
    @Autowired
    private ExampleService exampleService;

    @Test
    public void starterTest() {
        System.out.println(exampleService.wrap("hello"));
    }
}
