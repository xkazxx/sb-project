package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_category;

public interface Cskaoyan_mall_categoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_category record);

    int insertSelective(Cskaoyan_mall_category record);

    Cskaoyan_mall_category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_category record);

    int updateByPrimaryKey(Cskaoyan_mall_category record);
}