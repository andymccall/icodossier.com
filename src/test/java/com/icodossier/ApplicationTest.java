package com.icodossier;

import static org.assertj.core.api.Assertions.assertThat;

import com.icodossier.controller.WebController;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * The ApplicationTest class is a test class that
 * tests the Application class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(
        locations = "classpath:test.properties")
public class ApplicationTest {

    @Autowired
    private WebController controller;
        
    @Test
    public void contextLoads() {
           assertThat(controller).isNotNull();
    }

}
