package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user_formid;

public interface Cskaoyan_mall_user_formidMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_user_formid record);

    int insertSelective(Cskaoyan_mall_user_formid record);

    Cskaoyan_mall_user_formid selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_user_formid record);

    int updateByPrimaryKey(Cskaoyan_mall_user_formid record);
}