package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_goods_specification;

public interface Cskaoyan_mall_goods_specificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_goods_specification record);

    int insertSelective(Cskaoyan_mall_goods_specification record);

    Cskaoyan_mall_goods_specification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_goods_specification record);

    int updateByPrimaryKey(Cskaoyan_mall_goods_specification record);
}