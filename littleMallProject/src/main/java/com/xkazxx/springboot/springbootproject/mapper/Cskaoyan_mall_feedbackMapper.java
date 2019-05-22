package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_feedback;

public interface Cskaoyan_mall_feedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_feedback record);

    int insertSelective(Cskaoyan_mall_feedback record);

    Cskaoyan_mall_feedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_feedback record);

    int updateByPrimaryKey(Cskaoyan_mall_feedback record);
}