package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon_rules;

public interface Cskaoyan_mall_groupon_rulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_groupon_rules record);

    int insertSelective(Cskaoyan_mall_groupon_rules record);

    Cskaoyan_mall_groupon_rules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_groupon_rules record);

    int updateByPrimaryKey(Cskaoyan_mall_groupon_rules record);
}