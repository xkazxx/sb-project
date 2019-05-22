package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_cuppon;

public interface Cskaoyan_mall_cupponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_cuppon record);

    int insertSelective(Cskaoyan_mall_cuppon record);

    Cskaoyan_mall_cuppon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_cuppon record);

    int updateByPrimaryKey(Cskaoyan_mall_cuppon record);
}