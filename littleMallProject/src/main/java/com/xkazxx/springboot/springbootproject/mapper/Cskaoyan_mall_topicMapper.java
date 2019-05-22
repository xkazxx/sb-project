package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_topic;

public interface Cskaoyan_mall_topicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_topic record);

    int insertSelective(Cskaoyan_mall_topic record);

    Cskaoyan_mall_topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_topic record);

    int updateByPrimaryKeyWithBLOBs(Cskaoyan_mall_topic record);

    int updateByPrimaryKey(Cskaoyan_mall_topic record);
}