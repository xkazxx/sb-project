package com.xkazxx.springboot.springbootproject.service;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon_rules;

import java.util.Map;

public interface GrouponService {
    Map getGrouponRulesList(Integer page, Integer limit, Integer goodsId, String sort, String order);

    Map createGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules);

    Map updateGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules);

    Map deleteGrouponRules(Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules);

    Map getGrouponlistRecord(Integer page, Integer limit, Integer goodsId, String sort, String order);
}
