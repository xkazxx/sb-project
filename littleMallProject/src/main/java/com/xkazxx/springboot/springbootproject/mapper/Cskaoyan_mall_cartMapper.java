package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_cart;

public interface Cskaoyan_mall_cartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_cart record);

    int insertSelective(Cskaoyan_mall_cart record);

    Cskaoyan_mall_cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_cart record);

    int updateByPrimaryKey(Cskaoyan_mall_cart record);
}