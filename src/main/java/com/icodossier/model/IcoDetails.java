package com.icodossier.model;

/**
 * The IcoDetails class.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-22
 */
public class IcoDetails {

    Long icoId;
    String icoName;
    String icoCode;

    public IcoDetails() {
    }

    public IcoDetails(Long icoId, String icoName, String icoCode) {
        this.icoId = icoId;
        this.icoName = icoName;
        this.icoCode = icoCode;
    }

    public Long getIcoId() {
        return icoId;
    }

    public void setIcoId(Long icoId) {
        this.icoId = icoId;
    }

    public String getIcoName() {
        return icoName;
    }

    public void setIcoName(String icoName) {
        this.icoName = icoName;
    }

    public String getIcoCode() {
        return icoCode;
    }

    public void setIcoCode(String icoCode) {
        this.icoCode = icoCode;
    }
}
