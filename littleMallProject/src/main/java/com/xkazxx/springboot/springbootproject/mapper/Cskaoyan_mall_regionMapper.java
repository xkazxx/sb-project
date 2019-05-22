package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_region;

public interface Cskaoyan_mall_regionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_region record);

    int insertSelective(Cskaoyan_mall_region record);

    Cskaoyan_mall_region selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_region record);

    int updateByPrimaryKey(Cskaoyan_mall_region record);
}