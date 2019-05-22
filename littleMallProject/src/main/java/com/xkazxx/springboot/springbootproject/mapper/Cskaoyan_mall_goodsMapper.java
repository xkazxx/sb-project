package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_goods;

public interface Cskaoyan_mall_goodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_goods record);

    int insertSelective(Cskaoyan_mall_goods record);

    Cskaoyan_mall_goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_goods record);

    int updateByPrimaryKeyWithBLOBs(Cskaoyan_mall_goods record);

    int updateByPrimaryKey(Cskaoyan_mall_goods record);
}