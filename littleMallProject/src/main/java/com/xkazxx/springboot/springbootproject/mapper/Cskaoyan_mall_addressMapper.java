package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_addressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_address record);

    int insertSelective(Cskaoyan_mall_address record);

    Cskaoyan_mall_address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_address record);

    int updateByPrimaryKey(Cskaoyan_mall_address record);

    List<Cskaoyan_mall_address> getAddressList(@Param("page") Integer page, @Param("limit") Integer limit,
                                               @Param("userId") Integer userId, @Param("name") String name);

}