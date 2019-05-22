package com.xkazxx.springboot.springbootproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_userMapper;
import com.xkazxx.springboot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    Cskaoyan_mall_userMapper cskaoyanMallUserMapper;


    @Override
    public Map getUserList(Integer page, Integer limit) {

        Map map = new HashMap();

        Map data = new HashMap();
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_user> pageInfo =
                new PageInfo<>(cskaoyanMallUserMapper.getUserList(page,limit));
        data.put("total",pageInfo.getTotal());
        data.put("items",pageInfo.getList());

        map.put("data",data);
        map.put("errmsg","成功");
        map.put("errno", 0);
        return map;
    }
}
