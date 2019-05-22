package com.xkazxx.springboot.springbootproject.service.impl;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_userMapper;
import com.xkazxx.springboot.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    Cskaoyan_mall_userMapper userMapper;



    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)
    public Cskaoyan_mall_user login(String username, String password) {
        return userMapper.login(username,password);
    }
}
