package com.qi.entity;

import java.io.Serializable;

/**
 * (Storage)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class Storage implements Serializable {
    private static final long serialVersionUID = 555638002916977585L;

    private Integer stkId;

    private String stkWarehouse;

    private String stkWare;

    private Integer stkCount;

    private Integer stkProdId;


    public Integer getStkId() {
        return stkId;
    }

    public void setStkId(Integer stkId) {
        this.stkId = stkId;
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse;
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare;
    }

    public Integer getStkCount() {
        return stkCount;
    }

    public void setStkCount(Integer stkCount) {
        this.stkCount = stkCount;
    }

    public Integer getStkProdId() {
        return stkProdId;
    }

    public void setStkProdId(Integer stkProdId) {
        this.stkProdId = stkProdId;
    }

}

