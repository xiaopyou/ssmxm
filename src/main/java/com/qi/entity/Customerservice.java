package com.qi.entity;

import java.io.Serializable;

/**
 * (Customerservice)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class Customerservice implements Serializable {
    private static final long serialVersionUID = 546633964274814738L;

    private String customerid;

    private Integer serviceid;


    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

}

