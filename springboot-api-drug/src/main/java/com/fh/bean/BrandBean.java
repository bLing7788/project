package com.fh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("drug_brand")
public class BrandBean {

    @TableId(value = "brandid", type = IdType.AUTO)
    private int brandid;

    @TableField("brandname")
    private String brandname;

}
