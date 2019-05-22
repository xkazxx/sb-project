package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_search_history;

public interface Cskaoyan_mall_search_historyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_search_history record);

    int insertSelective(Cskaoyan_mall_search_history record);

    Cskaoyan_mall_search_history selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_search_history record);

    int updateByPrimaryKey(Cskaoyan_mall_search_history record);
}