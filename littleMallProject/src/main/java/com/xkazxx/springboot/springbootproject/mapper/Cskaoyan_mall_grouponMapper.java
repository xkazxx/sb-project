package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon;

public interface Cskaoyan_mall_grouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_groupon record);

    int insertSelective(Cskaoyan_mall_groupon record);

    Cskaoyan_mall_groupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_groupon record);

    int updateByPrimaryKey(Cskaoyan_mall_groupon record);
}