package com.qi.entity;

import java.io.Serializable;

/**
 * (SysRight)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class SysRight implements Serializable {
    private static final long serialVersionUID = 643568000544268587L;

    private Integer rightCode;

    private Integer rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;


    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(Integer rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }

}

