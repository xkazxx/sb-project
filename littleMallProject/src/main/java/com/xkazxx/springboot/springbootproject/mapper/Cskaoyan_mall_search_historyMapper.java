package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_search_history;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_search_historyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_search_history record);

    int insertSelective(Cskaoyan_mall_search_history record);

    Cskaoyan_mall_search_history selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_search_history record);

    int updateByPrimaryKey(Cskaoyan_mall_search_history record);

    List<Cskaoyan_mall_search_history> getSearchHistoryList(@Param("page") Integer page,@Param("limit") Integer limit,
                                                            @Param("userId") Integer userId, @Param("keyword") String keyword);
}