package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_footprint;

public interface Cskaoyan_mall_footprintMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_footprint record);

    int insertSelective(Cskaoyan_mall_footprint record);

    Cskaoyan_mall_footprint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_footprint record);

    int updateByPrimaryKey(Cskaoyan_mall_footprint record);
}