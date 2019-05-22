package com.xkazxx.springboot.springbootproject.service;


import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user;

public interface UserService {

    Cskaoyan_mall_user login(String username, String password);
}
