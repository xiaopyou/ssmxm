package com.qi.entity;

import java.io.Serializable;

/**
 * (SysRoleRight)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:38
 */
public class SysRoleRight implements Serializable {
    private static final long serialVersionUID = -87815148537153188L;

    private Integer rfId;

    private Integer rfRoleId;

    private Integer rfRightCode;


    public Integer getRfId() {
        return rfId;
    }

    public void setRfId(Integer rfId) {
        this.rfId = rfId;
    }

    public Integer getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Integer rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

    public Integer getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(Integer rfRightCode) {
        this.rfRightCode = rfRightCode;
    }

}

