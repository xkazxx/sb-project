package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_goods_product;

public interface Cskaoyan_mall_goods_productMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_goods_product record);

    int insertSelective(Cskaoyan_mall_goods_product record);

    Cskaoyan_mall_goods_product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_goods_product record);

    int updateByPrimaryKey(Cskaoyan_mall_goods_product record);
}