package com.qi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CstActivity)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:36
 */
public class CstActivity implements Serializable {
    private static final long serialVersionUID = -27065149494558885L;

    private Integer atvId;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvDesc;

    private String atvMemo;

    private String atvCustNo;


    public Integer getAtvId() {
        return atvId;
    }

    public void setAtvId(Integer atvId) {
        this.atvId = atvId;
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace;
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle;
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc;
    }

    public String getAtvMemo() {
        return atvMemo;
    }

    public void setAtvMemo(String atvMemo) {
        this.atvMemo = atvMemo;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo;
    }

}

