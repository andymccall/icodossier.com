package com.icodossier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * The ApplicationTest class is a test class that
 * tests the Application class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource(
        locations = "classpath:test.properties")
public class ApplicationTest {

    /**
     * Tests Application.main()
     */
    @Test
    public void main_NoErrorOutput_Passes() throws Exception {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outContent));

        String[] args = {};

        try {
            Application.main(args);
        } catch (Exception exception) {
        }

        assertEquals("Application.main() has failed", "", outContent.toString());

    }

    @Test
    public void Application_applicationContextLoads_Passes() {
    }

}