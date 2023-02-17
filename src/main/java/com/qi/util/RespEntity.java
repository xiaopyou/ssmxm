package com.qi.util;

public class RespEntity {
    private Integer code;//自己公司的状态码
    private Integer stats;//http的状态码
    private String msg;//信息提示
    private Object data;
    //......还有的一些根据公司业务来定义属性


    public RespEntity(Object data) {
        this.code = 6000;
        this.stats = 200;
        this.msg = "操作成功！";
        this.data = data;
    }
    public RespEntity(Integer code, Integer stats, String msg) {
        this.code = code;
        this.stats = stats;
        this.msg = msg;
    }

    public RespEntity(Integer code, Integer stats, String msg, Object data) {
        this.code = code;
        this.stats = stats;
        this.msg = msg;
        this.data = data;
    }

    public RespEntity() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
