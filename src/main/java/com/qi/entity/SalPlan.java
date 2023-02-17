package com.qi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SalPlan)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:37
 */
public class SalPlan implements Serializable {
    private static final long serialVersionUID = -18148059044068679L;

    private Integer plaId;

    private Date plaDate;

    private String plaTodo;

    private String plaResult;

    private Integer plaChcId;


    public Integer getPlaId() {
        return plaId;
    }

    public void setPlaId(Integer plaId) {
        this.plaId = plaId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo;
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult;
    }

    public Integer getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Integer plaChcId) {
        this.plaChcId = plaChcId;
    }

}

