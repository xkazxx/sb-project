package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_issue;

public interface Cskaoyan_mall_issueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_issue record);

    int insertSelective(Cskaoyan_mall_issue record);

    Cskaoyan_mall_issue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_issue record);

    int updateByPrimaryKey(Cskaoyan_mall_issue record);
}