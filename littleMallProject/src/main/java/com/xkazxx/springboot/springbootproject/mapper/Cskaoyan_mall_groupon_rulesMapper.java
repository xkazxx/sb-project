package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon_rules;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_groupon_rulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_groupon_rules record);

    int insertSelective(Cskaoyan_mall_groupon_rules record);

    Cskaoyan_mall_groupon_rules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_groupon_rules record);

    int updateByPrimaryKey(Cskaoyan_mall_groupon_rules record);

    List<Cskaoyan_mall_groupon_rules> getGrouponRulesList(@Param("page") Integer page, @Param("limit") Integer limit,
                                                          @Param("goodsId") Integer goodsId,
                                                          @Param("sort") String sort, @Param("order") String order);

    Cskaoyan_mall_groupon_rules selectGrouponRulesLastone();
}