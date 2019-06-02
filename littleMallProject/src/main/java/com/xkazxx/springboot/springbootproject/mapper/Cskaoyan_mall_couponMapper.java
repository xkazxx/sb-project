package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_coupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_couponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_coupon record);

    int insertSelective(Cskaoyan_mall_coupon record);

    Cskaoyan_mall_coupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_coupon record);

    int updateByPrimaryKey(Cskaoyan_mall_coupon record);

    List<Cskaoyan_mall_coupon> getCouponList(@Param("page") Integer page, @Param("limit") Integer limit,
                                             @Param("name") String name, @Param("type") String type,
                                             @Param("status") Short status);


    Cskaoyan_mall_coupon selectCouponLastone();
}