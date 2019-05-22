package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_permission;

public interface Cskaoyan_mall_permissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_permission record);

    int insertSelective(Cskaoyan_mall_permission record);

    Cskaoyan_mall_permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_permission record);

    int updateByPrimaryKey(Cskaoyan_mall_permission record);
}