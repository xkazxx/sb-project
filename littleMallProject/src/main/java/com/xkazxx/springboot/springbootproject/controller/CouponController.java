package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Map;

@RestController
public class CouponController {

    @Autowired
    CouponService couponService;

    @RequestMapping("/coupon/list")
    public Map getCouponList(Integer page, Integer limit, String name, String type, Short status) {
        return couponService.getCouponList(page,limit,name,type,status);

    }
    @RequestMapping("/coupon/read")
    public Map getCouponById(@NotNull Integer id) {
        return couponService.getCouponById(id);

    }
   @RequestMapping("/coupon/listuser")
    public Map getCouponUserList(Integer page, Integer limit, Integer userId, Integer status,Integer couponId ) {
       Map couponUserList = couponService.getCouponUserList(page, limit, userId, status, couponId);
       return couponUserList;

    }


}
