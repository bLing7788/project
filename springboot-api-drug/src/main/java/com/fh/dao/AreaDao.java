package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.fh.bean.AreaBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface AreaDao extends BaseMapper<AreaBean> {

}
