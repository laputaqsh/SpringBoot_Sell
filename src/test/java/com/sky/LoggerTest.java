package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "qsh";
        String pwd = "3210";
        log.debug("debug...");
        log.info("name:" + name + ", pwd:" + pwd);
        log.info("name:{}, pwd:{}", name, pwd);
        log.error("error...");
    }
}
