package com.xkazxx.springboot.springbootproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.*;
import com.xkazxx.springboot.springbootproject.mapper.*;
import com.xkazxx.springboot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    Cskaoyan_mall_userMapper cskaoyanMallUserMapper;

    @Autowired
    Cskaoyan_mall_adminMapper cskaoyanMallAdminMapper;

    @Autowired
    Cskaoyan_mall_addressMapper cskaoyanMallAddressMapper;

    @Autowired
    Cskaoyan_mall_collectMapper cskaoyanMallCollectMapper;

    @Autowired
    Cskaoyan_mall_footprintMapper cskaoyanMallFootprintMapper;

    @Autowired
    Cskaoyan_mall_search_historyMapper cskaoyanMallSearchHistoryMapper;

    @Autowired
    Cskaoyan_mall_feedbackMapper cskaoyanMallFeedbackMapper;

    @Override
    public Map getUserList(Integer page, Integer limit, String username, String mobile) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_user> pageInfo =
                new PageInfo<>(cskaoyanMallUserMapper.getUserList(page,limit,username,mobile));
        return getResultMap(pageInfo);
    }

    @Override
    public Map getAddressList(Integer page, Integer limit, Integer userId, String name) {
        Map map = new HashMap();
        Map data = new HashMap();
      PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_address> pageInfo =
                new PageInfo<>(cskaoyanMallAddressMapper.getAddressList(page,limit,userId,name));
        data.put("items",pageInfo.getList());
        data.put("total",pageInfo.getTotal());
        data.put("pages",pageInfo.getPages());
        data.put("limit",pageInfo.getPageSize());
        data.put("page",pageInfo.getPageNum());

        map.put("data",data);
        map.put("errmsg","成功");
        map.put("errno", 0);
        return map;
    }

    @Override
    public Map getCollectList(Integer page, Integer limit, Integer userId, Integer valueId) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_collect> pageInfo =
                new PageInfo<>(cskaoyanMallCollectMapper.getCollectList(page,limit,userId,valueId));
        return getResultMap(pageInfo);
    }

    @Override
    public Map getFootprintList(Integer page, Integer limit, Integer userId, Integer goodsId) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_footprint> pageInfo =
                new PageInfo<>(cskaoyanMallFootprintMapper.getFootprintList(page,limit,userId,goodsId));
        return getResultMap(pageInfo);
    }

    @Override
    public Map getSearchHistoryList(Integer page, Integer limit, Integer userId, String keyword) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_search_history> pageInfo =
                new PageInfo<>(cskaoyanMallSearchHistoryMapper.getSearchHistoryList(page,limit,userId,keyword));
        return getResultMap(pageInfo);
    }

    @Override
    public Map getFeedbackList(Integer page, Integer limit, Integer id, String username) {

        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_feedback> pageInfo =
                new PageInfo<>(cskaoyanMallFeedbackMapper.getFeedbackList(page,limit,id,username));
        return getResultMap(pageInfo);

    }

    @Override
    public Cskaoyan_mall_admin getAdminByAdminname(String username) {
        Cskaoyan_mall_admin adminByAdminname = cskaoyanMallAdminMapper.getAdminByAdminname(username);
        return adminByAdminname;
    }

    public Map getResultMap(PageInfo pageInfo){
        Map map = new HashMap();
        Map data = new HashMap();
        data.put("items",pageInfo.getList());
        data.put("total",pageInfo.getTotal());
        map.put("data",data);
        map.put("errmsg","成功");
        map.put("errno", 0);
        return map;
    }

}
