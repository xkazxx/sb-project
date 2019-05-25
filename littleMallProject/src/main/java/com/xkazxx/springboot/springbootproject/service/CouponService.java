package com.xkazxx.springboot.springbootproject.service;

import java.util.Map;

public interface CouponService {

    Map getCouponList(Integer page, Integer limit, String name, String type, Short status);

    Map getCouponById(Integer id);

    Map getCouponUserList(Integer page, Integer limit, Integer userId, Integer status, Integer couponId);

}
