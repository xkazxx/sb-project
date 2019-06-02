package com.xkazxx.springboot.springbootproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_goods;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon_rules;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_goodsMapper;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_grouponMapper;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_groupon_rulesMapper;
import com.xkazxx.springboot.springbootproject.service.GrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class GrouponServiceImpl implements GrouponService {

    @Autowired
    Cskaoyan_mall_grouponMapper cskaoyanMallGrouponMapper;

    @Autowired
    Cskaoyan_mall_groupon_rulesMapper cskaoyanMallGrouponRulesMapper;

    @Autowired
    Cskaoyan_mall_goodsMapper cskaoyanMallGoodsMapper;

    @Override
    public Map getGrouponRulesList(Integer page, Integer limit, Integer goodsId, String sort, String order) {
        PageHelper.startPage(page, limit);
        PageInfo<Cskaoyan_mall_groupon_rules> pageInfo = new PageInfo<>(cskaoyanMallGrouponRulesMapper.getGrouponRulesList(page, limit, goodsId, sort, order));
        return getResultMap(pageInfo);
    }

    @Override
    public Map getGrouponlistRecord(Integer page, Integer limit, Integer goodsId, String sort, String order) {
     /*   PageHelper.startPage(page, limit);
        PageInfo<Cskaoyan_mall_groupon> pageInfo = new PageInfo<>(cskaoyanMallGrouponMapper.getGrouponlistRecord(page, limit, goodsId, sort, order));
     */   return getResultMap(null);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public Map createGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules) {
        Cskaoyan_mall_goods cskaoyanMallGoods = cskaoyanMallGoodsMapper.selectByPrimaryKey(cskaoyanMallGrouponRules.getGoodsId());
        Date date = new Date();
        cskaoyanMallGrouponRules.setPicUrl(cskaoyanMallGoods.getPicUrl());
        cskaoyanMallGrouponRules.setGoodsName(cskaoyanMallGoods.getName());
        cskaoyanMallGrouponRules.setAddTime(date);
        cskaoyanMallGrouponRules.setUpdateTime(date);
        cskaoyanMallGrouponRules.setDeleted(false);
        cskaoyanMallGrouponRulesMapper.insert(cskaoyanMallGrouponRules);
        Map map = new HashMap();
        map.put("errmsg", "成功");
        map.put("data", cskaoyanMallGrouponRulesMapper.selectGrouponRulesLastone());
        map.put("errno", 0);
        return map;
    }

    @Override
    public Map updateGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules) {
        cskaoyanMallGrouponRules.setUpdateTime(new Date());
        cskaoyanMallGrouponRulesMapper.updateByPrimaryKey(cskaoyanMallGrouponRules);
        Map map = new HashMap();
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }

    @Override
    public Map deleteGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules) {
        cskaoyanMallGrouponRulesMapper.deleteByPrimaryKey(cskaoyanMallGrouponRules.getId());
        Map map = new HashMap();
        map.put("errno", 0);
        map.put("errmsg", "成功");
        return map;
    }

    public Map getResultMap(PageInfo pageInfo) {
        Map data = new HashMap();
        Map map = new HashMap();
        if(pageInfo != null) {
            data.put("total", pageInfo.getTotal());
            data.put("items", pageInfo.getList());
        }
        map.put("errmsg", "成功");
        map.put("data", data);
        map.put("errno", 0);
        return map;
    }

}
