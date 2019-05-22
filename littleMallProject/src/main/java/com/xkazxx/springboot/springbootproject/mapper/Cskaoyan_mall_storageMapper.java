package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;

public interface Cskaoyan_mall_storageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_storage record);

    int insertSelective(Cskaoyan_mall_storage record);

    Cskaoyan_mall_storage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_storage record);

    int updateByPrimaryKey(Cskaoyan_mall_storage record);
}