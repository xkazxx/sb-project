package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_goods_attribute;

public interface Cskaoyan_mall_goods_attributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_goods_attribute record);

    int insertSelective(Cskaoyan_mall_goods_attribute record);

    Cskaoyan_mall_goods_attribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_goods_attribute record);

    int updateByPrimaryKey(Cskaoyan_mall_goods_attribute record);
}