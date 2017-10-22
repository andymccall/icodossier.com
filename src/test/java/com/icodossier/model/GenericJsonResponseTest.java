package com.icodossier.model;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * The GenericJsonResponseTest class is a test class that
 * tests the GenericJsonResponse class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-22
 */
public class GenericJsonResponseTest {

    GenericJsonResponse<String> genericJsonResponseUnderTest;

    @Before
    public void setUp() throws Exception {

        genericJsonResponseUnderTest = new GenericJsonResponse<>();
        genericJsonResponseUnderTest.setResult(Lists.newArrayList("Test"));
    }

    /**
     * Tests GenericJsonResponse.getResult()
     */
    @Test
    public void getResult_ResultIsGot_Passes() throws Exception {
        Assert.assertEquals("GenericJsonResponse.getResult() has failed", "Test", genericJsonResponseUnderTest.getResult().get(0));
    }

    /**
     * Tests GenericJsonResponse.setResult()
     */
    @Test
    public void setResult_ResultIsSet_Passes() throws Exception {
        genericJsonResponseUnderTest.setResult(Lists.newArrayList("Test2"));
        Assert.assertEquals("GenericJsonResponse.getResult() has failed", "Test2", genericJsonResponseUnderTest.getResult().get(0));
    }

    /**
     * Tests GenericJsonResponse.toString()
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "GenericJsonResponse.toString() has failed",
                "GenericJsonResponse{status=0, result=[Test], message='null}", genericJsonResponseUnderTest.toString());
    }

}