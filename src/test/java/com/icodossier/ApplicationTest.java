package com.icodossier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource(
        locations = "classpath:test.properties")
public class ApplicationTest {

    @Test
    public void Application_applicationContextLoads_Passes() {
    }
}