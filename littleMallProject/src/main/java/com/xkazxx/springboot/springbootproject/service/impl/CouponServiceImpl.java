package com.xkazxx.springboot.springbootproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.*;
import com.xkazxx.springboot.springbootproject.mapper.*;
import com.xkazxx.springboot.springbootproject.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CouponServiceImpl implements CouponService {


    @Autowired
    Cskaoyan_mall_couponMapper cskaoyanMallCouponMapper;

    @Autowired
    Cskaoyan_mall_coupon_userMapper cskaoyan_mall_coupon_userMapper;
    public Map getResultMap(PageInfo pageInfo){
        Map map = new HashMap();
        Map data = new HashMap();
        data.put("items",pageInfo.getList());
        data.put("total",pageInfo.getTotal());
        map.put("data",data);
        map.put("errno", 0);
        map.put("errmsg","成功");
        return map;
    }

    @Override
    public Map getCouponList(Integer page, Integer limit, String name, String type, Short status) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_coupon> pageInfo =
                new PageInfo<>(cskaoyanMallCouponMapper.getCouponList(page,limit,name,type,status));
        return getResultMap(pageInfo);

    }

    @Override
    public Map getCouponById(Integer id) {
        Map map = new HashMap();
        map.put("data",cskaoyanMallCouponMapper.selectByPrimaryKey(id));
        map.put("errno", 0);
        map.put("errmsg","成功");
        return map;
    }

    @Override
    public Map getCouponUserList(Integer page, Integer limit, Integer userId, Integer status, Integer couponId) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_coupon_user> pageInfo =
                new PageInfo<>(cskaoyan_mall_coupon_userMapper.getCouponUserList(page,limit,userId,couponId,status));
        Map map = new HashMap();
        Map data = new HashMap();
        data.put("list",pageInfo.getList());
        data.put("total",pageInfo.getTotal());
        map.put("data",data);
        map.put("errno", 0);
        map.put("errmsg","成功");
        return map;
    }
}
