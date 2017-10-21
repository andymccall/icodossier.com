package com.icodossier.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The JsonResponseTest class is a test class that
 * tests the JsonResponse class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-18
 */
public class JsonResponseTest {

    JsonResponse jsonResponseUnderTest;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {
        jsonResponseUnderTest = new JsonResponse(200, "Test message");
    }

    /**
     * Tests JsonResponse.getStatus()
     */
    @Test
    public void getStatus_StatusGot_Passes() throws Exception {
        Assert.assertEquals("JsonResponse.getStatus() has failed", 200, jsonResponseUnderTest.getStatus());
    }

    /**
     * Tests JsonResponse.setStatus()
     */
    @Test
    public void setStatus_StatusIsSet_Passes() throws Exception {
        jsonResponseUnderTest.setStatus(300);
        Assert.assertEquals("Tests JsonResponse.setStatus() has failed", 300, jsonResponseUnderTest.getStatus());
    }

    /**
     * Tests JsonResponse.getMessage()
     */
    @Test
    public void getMessage_MessageIsGot_Passes() throws Exception {
        Assert.assertEquals("JsonResponse.getMessage() has failed", "Test message", jsonResponseUnderTest.getMessage());
    }

    /**
     * Tests JsonResponse.setMessage()
     */
    @Test
    public void setMessage_MessageIsSet_Passes() throws Exception {
        jsonResponseUnderTest.setMessage("Second test message");
        Assert.assertEquals("JsonResponse.setMessage() has failed", "Second test message", jsonResponseUnderTest.getMessage());
    }

    /**
     * Tests JsonResponse.setMessage() on empty message
     */
    @Test(expected = IllegalArgumentException.class)
    public void setMessage_EmptyMessageThrowsException_Passes() throws Exception {
        jsonResponseUnderTest.setMessage("");
    }

}