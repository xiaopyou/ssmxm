package com.qi.qyl.entity;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:33:56
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -72338809410503303L;

    private Integer id;

    private String usrId;

    private String usrName;

    private String usrPassword;

    private Integer usrFlag;

    private Integer usrRoleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Integer getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Integer usrFlag) {
        this.usrFlag = usrFlag;
    }

    public Integer getUsrRoleId() {
        return usrRoleId;
    }

    public void setUsrRoleId(Integer usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

}

