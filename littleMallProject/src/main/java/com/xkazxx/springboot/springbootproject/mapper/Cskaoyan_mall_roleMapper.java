package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_role;

public interface Cskaoyan_mall_roleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_role record);

    int insertSelective(Cskaoyan_mall_role record);

    Cskaoyan_mall_role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_role record);

    int updateByPrimaryKey(Cskaoyan_mall_role record);
}