package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_brand;

public interface Cskaoyan_mall_brandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_brand record);

    int insertSelective(Cskaoyan_mall_brand record);

    Cskaoyan_mall_brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_brand record);

    int updateByPrimaryKey(Cskaoyan_mall_brand record);
}