package com.qi.entity;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 200219402093556569L;

    private Integer prodId;

    private String prodName;

    private String prodType;

    private String prodBatch;

    private String prodUnit;

    private Object prodPrice;

    private String prodMemo;


    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch;
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit;
    }

    public Object getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Object prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdMemo() {
        return prodMemo;
    }

    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo;
    }

}

