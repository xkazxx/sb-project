package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_user record);

    int insertSelective(Cskaoyan_mall_user record);

    Cskaoyan_mall_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_user record);

    int updateByPrimaryKey(Cskaoyan_mall_user record);

    Cskaoyan_mall_user login(@Param("username") String username,
                             @Param("password") String password);

    List<Cskaoyan_mall_user> getUserList(@Param("page") Integer page, @Param("limit") Integer limit,
                                         @Param("username") String username, @Param("mobile") String mobile);


    int countUserByAddDate();

}