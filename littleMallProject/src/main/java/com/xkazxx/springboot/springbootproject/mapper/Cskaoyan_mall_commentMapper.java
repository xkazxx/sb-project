package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_comment;

public interface Cskaoyan_mall_commentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_comment record);

    int insertSelective(Cskaoyan_mall_comment record);

    Cskaoyan_mall_comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_comment record);

    int updateByPrimaryKey(Cskaoyan_mall_comment record);
}