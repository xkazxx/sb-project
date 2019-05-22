package com.xkazxx.springboot.springbootproject.controller;


import com.xkazxx.springboot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public Map getUserList(Integer page,Integer limit){
       return userService.getUserList(page,limit);
    }




}
