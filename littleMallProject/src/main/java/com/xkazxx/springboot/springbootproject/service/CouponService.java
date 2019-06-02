package com.xkazxx.springboot.springbootproject.service;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_coupon;

import java.util.Map;

public interface CouponService {

    Map getCouponList(Integer page, Integer limit, String name, String type, Short status);

    Map getCouponById(Integer id);

    Map getCouponUserList(Integer page, Integer limit, Integer userId, Integer status, Integer couponId);

    Map createCoupon(Cskaoyan_mall_coupon cskaoyanMallCoupon);

    Map updateCoupon(Cskaoyan_mall_coupon cskaoyanMallCoupon);

    Map deleteCoupon(Cskaoyan_mall_coupon cskaoyanMallCoupon);
}
