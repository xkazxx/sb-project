package com.xkazxx.springboot.springbootproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_adminMapper;
import com.xkazxx.springboot.springbootproject.service.AdminService;
import com.xkazxx.springboot.springbootproject.util.GetRequestJsonUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("/auth")
public class HomeController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public Map testProject(HttpServletRequest request) throws IOException {
     /*   JSONObject jsonObject = GetRequestJsonUtils.getRequestJsonObject(request);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);

        Cskaoyan_mall_admin admin = (Cskaoyan_mall_admin) currentUser.getPrincipal();

        admin.setLastLoginIp(request.getRemoteAddr());
        admin.setLastLoginTime(new Date());
        adminService.updateById(admin);

        // userInfo
        Map<String, Object> adminInfo = new HashMap<String, Object>();
        adminInfo.put("nickName", admin.getUsername());
        adminInfo.put("avatar", admin.getAvatar());
*/
        Map result = new HashMap<>();
        result.put("errno",0);
        result.put("data","success");
        result.put("errmsg","成功");
        return result;
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
