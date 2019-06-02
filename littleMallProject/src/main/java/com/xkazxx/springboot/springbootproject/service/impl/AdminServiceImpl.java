package com.xkazxx.springboot.springbootproject.service.impl;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_adminMapper;
import com.xkazxx.springboot.springbootproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    Cskaoyan_mall_adminMapper cskaoyanMallAdminMapper;

    @Override
    public void updateById(Cskaoyan_mall_admin admin) {
        cskaoyanMallAdminMapper.updateByPrimaryKey(admin);
    }
}
