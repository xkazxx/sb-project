package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_coupon_user;

public interface Cskaoyan_mall_coupon_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_coupon_user record);

    int insertSelective(Cskaoyan_mall_coupon_user record);

    Cskaoyan_mall_coupon_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_coupon_user record);

    int updateByPrimaryKey(Cskaoyan_mall_coupon_user record);
}