package com.qi.entity;

import java.io.Serializable;

/**
 * (BasDict)实体类
 *
 * @author makejava
 * @since 2023-02-14 23:31:36
 */
public class BasDict implements Serializable {
    private static final long serialVersionUID = -28626910800318770L;

    private Integer dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Integer dictIsEditable;


    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Integer dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

}

