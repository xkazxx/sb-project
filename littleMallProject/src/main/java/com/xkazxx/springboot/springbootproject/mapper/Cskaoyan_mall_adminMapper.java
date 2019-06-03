package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;

public interface Cskaoyan_mall_adminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_admin record);

    int insertSelective(Cskaoyan_mall_admin record);

    Cskaoyan_mall_admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_admin record);

    int updateByPrimaryKey(Cskaoyan_mall_admin record);

}