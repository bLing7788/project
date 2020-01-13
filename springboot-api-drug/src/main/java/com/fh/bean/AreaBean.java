package com.fh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("drug_area")
public class AreaBean {

    @TableId(value = "areaid",type = IdType.AUTO )
    private int areaid;

    @TableField("areaname")
    private String areaname;
}
