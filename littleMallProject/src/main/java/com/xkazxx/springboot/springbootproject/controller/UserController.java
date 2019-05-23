package com.xkazxx.springboot.springbootproject.controller;


import com.xkazxx.springboot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public Map getUserList(Integer page,Integer limit,String username,String mobile){
       return userService.getUserList(page,limit,username,mobile);
    }

    @RequestMapping("/address/list")
    public Map getAddressList(Integer page,Integer limit,Integer userId,String name){
       return userService.getAddressList(page,limit,userId,name);
    }

    @RequestMapping("/collect/list")
    public Map getCollectList(Integer page,Integer limit,Integer userId,Integer valueId){
       return userService.getCollectList(page,limit,userId,valueId);
    }

    @RequestMapping("/footprint/list")
    public Map getFootprintList(Integer page,Integer limit,Integer userId,Integer goodsId){
       return userService.getFootprintList(page,limit,userId,goodsId);
    }

    @RequestMapping("/history/list")
    public Map getSearchHistoryList(Integer page,Integer limit,Integer userId,String keyword){
       return userService.getSearchHistoryList(page,limit,userId,keyword);
    }

    @RequestMapping("/feedback/list")
        public Map getFeedbackList(Integer page,Integer limit,Integer id,String username){
           return userService.getFeedbackList(page,limit,id,username);
        }


}
