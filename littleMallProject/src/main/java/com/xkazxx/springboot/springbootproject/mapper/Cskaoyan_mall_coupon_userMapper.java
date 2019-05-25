package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_coupon_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_coupon_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_coupon_user record);

    int insertSelective(Cskaoyan_mall_coupon_user record);

    Cskaoyan_mall_coupon_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_coupon_user record);

    int updateByPrimaryKey(Cskaoyan_mall_coupon_user record);

    List<Cskaoyan_mall_coupon_user> getCouponUserList(@Param("page") Integer page, @Param("limit") Integer limit,
                                                      @Param("userId") Integer userId, @Param("couponId") Integer couponId,
                                                      @Param("status") Integer status);
}