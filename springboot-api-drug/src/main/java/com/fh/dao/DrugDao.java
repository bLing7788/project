package com.fh.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.DrugBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface DrugDao extends BaseMapper<DrugBean> {

    /*
    查询
     */
    List<DrugBean> queryDrugLis();


}
