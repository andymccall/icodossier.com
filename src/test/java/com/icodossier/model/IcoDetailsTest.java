package com.icodossier.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andymccall on 22/10/2017.
 */
public class IcoDetailsTest {

    IcoDetails icoDetailsUndertest;

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {
        icoDetailsUndertest = new IcoDetails(Long.valueOf(1), "OmsieGo", "OMG");
    }

    @Test
    public void getIcoId_IcoIdIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoId() has failed", Long.valueOf(1), icoDetailsUndertest.getIcoId());
    }

    @Test
    public void setIcoId_IcoIdIsSet_Passes() throws Exception {
        icoDetailsUndertest.setIcoId(Long.valueOf(2));
        Assert.assertEquals("IcoDetails.setIcoId() has failed", Long.valueOf(2), icoDetailsUndertest.getIcoId());
    }

    @Test
    public void getIcoName_IcoNameIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoName() has failed", "OmsieGo", icoDetailsUndertest.getIcoName());
    }

    @Test
    public void setIcoName_IcoNameIsSet_Passes() throws Exception {
        icoDetailsUndertest.setIcoName("Gnosis");
        Assert.assertEquals("IcoDetails.setIcoName() has failed", "Gnosis", icoDetailsUndertest.getIcoName());
    }

    @Test
    public void getIcoCode_IcoCodeIsGot_Passes() throws Exception {
        Assert.assertEquals("IcoDetails.getIcoCode() has failed", "OMG", icoDetailsUndertest.getIcoCode());
    }

    @Test
    public void setIcoCode_IcoCodeIsSet_Passes() throws Exception {
        icoDetailsUndertest.setIcoCode("GNO");
        Assert.assertEquals("IcoDetails.setIcoCode() has failed", "GNO", icoDetailsUndertest.getIcoCode());
    }

}