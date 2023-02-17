package com.qi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 334500344657253679L;

    private Integer odrId;

    private Date odrDate;

    private String odrAddr;

    private String odrStatus;

    private String odrCustNo;


    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public Date getOdrDate() {
        return odrDate;
    }

    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr;
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus;
    }

    public String getOdrCustNo() {
        return odrCustNo;
    }

    public void setOdrCustNo(String odrCustNo) {
        this.odrCustNo = odrCustNo;
    }

}

