package com.xkazxx.springboot.springbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class HomeController {


    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.OPTIONS})
    @ResponseBody
    public Map testProject( String username, String password) {

        Map map = new HashMap<>();
        map.put("errno",0);
        map.put("data","success");
        map.put("errmsg","成功");
        return map;

    }

    @RequestMapping(value = "/info",method = {RequestMethod.GET,RequestMethod.OPTIONS})
    @ResponseBody
    public Map userInfo(@RequestParam("token") String token) {

        Map map = new HashMap<>();
        Map data = new HashMap<>();
        List perms = new ArrayList();
        List roles = new ArrayList();
        perms.add("*");
        roles.add("超级管理员");
        map.put("errno",0);
        map.put("errmsg","成功");

        data.put("perms",perms);
        data.put("roles",roles);
        data.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        data.put("name","admin123");
        map.put("data",data);

        return map;
    }

}
