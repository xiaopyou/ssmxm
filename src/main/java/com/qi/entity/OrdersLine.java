package com.qi.entity;

import java.io.Serializable;

/**
 * (OrdersLine)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class OrdersLine implements Serializable {
    private static final long serialVersionUID = -97687557003641851L;

    private Integer oddId;

    private Integer oddCount;

    private String oddUnit;

    private Object oddPrice;

    private Integer oddOrderId;

    private Integer oddProdId;


    public Integer getOddId() {
        return oddId;
    }

    public void setOddId(Integer oddId) {
        this.oddId = oddId;
    }

    public Integer getOddCount() {
        return oddCount;
    }

    public void setOddCount(Integer oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit;
    }

    public Object getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(Object oddPrice) {
        this.oddPrice = oddPrice;
    }

    public Integer getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Integer oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Integer getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Integer oddProdId) {
        this.oddProdId = oddProdId;
    }

}

