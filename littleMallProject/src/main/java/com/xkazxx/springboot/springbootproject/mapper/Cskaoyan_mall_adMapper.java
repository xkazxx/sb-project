package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_ad;

public interface Cskaoyan_mall_adMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_ad record);

    int insertSelective(Cskaoyan_mall_ad record);

    Cskaoyan_mall_ad selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_ad record);

    int updateByPrimaryKey(Cskaoyan_mall_ad record);
}