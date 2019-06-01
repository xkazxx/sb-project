package com.xkazxx.springboot.springbootproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.xkazxx.springboot.springbootproject.util.GetRequestJsonUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class HomeController {

    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.OPTIONS,RequestMethod.GET})
    @ResponseBody
    public Map testProject(HttpServletRequest request) throws IOException {
       /* JSONObject jsonObject = GetRequestJsonUtils.getRequestJsonObject(request);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        SecurityUtils.getSubject().login(token);*/
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
