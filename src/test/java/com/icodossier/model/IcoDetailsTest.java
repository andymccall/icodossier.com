package com.icodossier.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

/**
 * The IcoDetailsTest class is a test class that
 * tests the IcoDetails class
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2017-10-22
 */
public class IcoDetailsTest {

    IcoDetails icoDetailsUnderTest;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {
        icoDetailsUnderTest = new IcoDetails(Long.valueOf(1), "OmsieGo", "OMG");
    }

    /**
     * Tests IcoDetails()
     */
    @Test
    public void newEmptyIcoDetails_IsEmpty_Passes() throws Exception {
        IcoDetails emptyIcoDetailsUnderTest = new IcoDetails();

        BeanInfo beanInfo = Introspector.getBeanInfo(IcoDetails.class, Object.class);
        for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
            Object value = propertyDescriptor.getReadMethod().invoke(emptyIcoDetailsUnderTest);
            Assert.assertNull("Default constructor for IcoDetails() has failed",value);
        }
    }

    /**
     * Tests IcoDetails() with constructor arguments
     */
    @Test
    public void newIcoDetails_IsCorrect_Passes() throws Exception {

        IcoDetails icoDetailsUnderTest = new IcoDetails(Long.valueOf(1), "OmsieGo", "OMG");

        Assert.assertEquals("Constructor for IcoDetails() has failed", Long.valueOf(1), icoDetailsUnderTest.getIcoId());
        Assert.assertEquals("IcoDetails.getIcoName() has failed", "OmsieGo", icoDetailsUnderTest.getIcoName());
        Assert.assertEquals("IcoDetails.getIcoCode() has failed", "OMG", icoDetailsUnderTest.getIcoCode());

    }

    /**
     * Tests IcoDetails.getIcoId()
     */
    @Test
    public void getIcoId_IcoIdIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoId() has failed", Long.valueOf(1), icoDetailsUnderTest.getIcoId());
    }

    /**
     * Tests IcoDetails.getIcoId()
     */    @Test
    public void setIcoId_IcoIdIsSet_Passes() throws Exception {
        icoDetailsUnderTest.setIcoId(Long.valueOf(2));
        Assert.assertEquals("IcoDetails.setIcoId() has failed", Long.valueOf(2), icoDetailsUnderTest.getIcoId());
    }

    /**
     * Tests IcoDetails.getIcoName()
     */
    @Test
    public void getIcoName_IcoNameIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoName() has failed", "OmsieGo", icoDetailsUnderTest.getIcoName());
    }

    /**
     * Tests IcoDetails.setIcoName()
     */
    @Test
    public void setIcoName_IcoNameIsSet_Passes() throws Exception {
        icoDetailsUnderTest.setIcoName("Gnosis");
        Assert.assertEquals("IcoDetails.setIcoName() has failed", "Gnosis", icoDetailsUnderTest.getIcoName());
    }

    /**
     * Tests IcoDetails.getIcoCode()
     */
    @Test
    public void getIcoCode_IcoCodeIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoCode() has failed", "OMG", icoDetailsUnderTest.getIcoCode());
    }

    /**
     * Tests IcoDetails.setIcoCode()
     */
    @Test
    public void setIcoCode_IcoCodeIsSet_Passes() throws Exception {
        icoDetailsUnderTest.setIcoCode("GNO");
        Assert.assertEquals("IcoDetails.setIcoCode() has failed", "GNO", icoDetailsUnderTest.getIcoCode());
    }

}