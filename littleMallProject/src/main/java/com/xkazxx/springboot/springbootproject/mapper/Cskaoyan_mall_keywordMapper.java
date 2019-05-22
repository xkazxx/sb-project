package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_keyword;

public interface Cskaoyan_mall_keywordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_keyword record);

    int insertSelective(Cskaoyan_mall_keyword record);

    Cskaoyan_mall_keyword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_keyword record);

    int updateByPrimaryKey(Cskaoyan_mall_keyword record);
}