package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_topicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_topic record);

    int insertSelective(Cskaoyan_mall_topic record);

    Cskaoyan_mall_topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_topic record);

    int updateByPrimaryKeyWithBLOBs(Cskaoyan_mall_topic record);

    int updateByPrimaryKey(Cskaoyan_mall_topic record);

    List<Cskaoyan_mall_topic> getTopicList(@Param("page") Integer page, @Param("limit") Integer limit,
                                          @Param("title") String title, @Param("subtitle") String subtitle,
                                          @Param("sort") String sort, @Param("order") String order);

    Cskaoyan_mall_topic selectTopicLastone();
}