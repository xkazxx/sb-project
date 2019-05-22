package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_order;

public interface Cskaoyan_mall_orderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_order record);

    int insertSelective(Cskaoyan_mall_order record);

    Cskaoyan_mall_order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_order record);

    int updateByPrimaryKey(Cskaoyan_mall_order record);
}