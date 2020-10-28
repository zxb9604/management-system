package com.modeltest.model.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;
@Data
public class easypoi implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Id
     */
    @Excel(name = "编号", orderNum = "0", width = 15)
    private String id;

    /**
     * 登录用户名
     */
    @Excel(name = "用户名", orderNum = "1", width = 15)
    private String name;

    @Excel(name = "date1", orderNum = "2", width = 15)
    private String date1;

    @Excel(name = "date2", orderNum = "2", width = 15)
    private String date2;

    @Excel(name = "date3", orderNum = "2", width = 15)
    private String date3;

}