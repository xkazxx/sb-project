package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_system;

public interface Cskaoyan_mall_systemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_system record);

    int insertSelective(Cskaoyan_mall_system record);

    Cskaoyan_mall_system selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_system record);

    int updateByPrimaryKey(Cskaoyan_mall_system record);
}