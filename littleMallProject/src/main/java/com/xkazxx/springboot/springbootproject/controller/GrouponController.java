package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon_rules;
import com.xkazxx.springboot.springbootproject.service.GrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GrouponController {

    @Autowired
    GrouponService grouponService;


    @RequestMapping("/groupon/list")
    public Map getGrouponRulesList(Integer page, Integer limit, Integer goodsId, String sort,String order){
        return grouponService.getGrouponRulesList(page,limit,goodsId,sort,order);
    }

   @RequestMapping("/groupon/listRecord")
    public Map getGrouponlistRecord(Integer page, Integer limit, Integer goodsId, String sort,String order){
        return grouponService.getGrouponlistRecord(page,limit,goodsId,sort,order);

    }

    @RequestMapping("/groupon/create")
    public Map createGrouponRules(@RequestBody Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules){
        return grouponService.createGrouponRules(cskaoyanMallGrouponRules);
    }

    @RequestMapping("/groupon/update")
    public Map updateGrouponRules(@RequestBody Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules){
        return grouponService.updateGrouponRules(cskaoyanMallGrouponRules);
    }

    @RequestMapping("/groupon/delete")
    public Map deleteGrouponRules(@RequestBody Cskaoyan_mall_groupon_rules cskaoyanMallGrouponRules){
        return grouponService.deleteGrouponRules(cskaoyanMallGrouponRules);
    }
}
