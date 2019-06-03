package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/stat")
public class StatController {

    @Autowired
    StatService statService;

    @RequestMapping("/user")
    public Map queryUserStat(){
        Map map = statService.queryUserStatmsg();
        return map;
    }
    @RequestMapping("/order")
    public Map queryOrderStat(){
        Map map = statService.queryOrderStatmsg();
        return map;
    }
    @RequestMapping("/goods")
    public Map queryGoodsStat(){
        Map map = statService.queryGoodsStatmsg();
        return map;
    }
}