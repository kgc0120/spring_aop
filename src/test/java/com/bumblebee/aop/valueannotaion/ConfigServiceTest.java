package com.bumblebee.aop.valueannotaion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author bumblebee
 */
@SpringBootTest
class ConfigServiceTest {

    @Autowired
    Config config;

    @Test
    void findActiveRootTest() {
        String root = "home";
        Assertions.assertEquals(config.getPath(), root);
    }

}