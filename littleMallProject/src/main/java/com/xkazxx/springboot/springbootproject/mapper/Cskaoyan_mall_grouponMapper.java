package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_groupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_grouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_groupon record);

    int insertSelective(Cskaoyan_mall_groupon record);

    Cskaoyan_mall_groupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_groupon record);

    int updateByPrimaryKey(Cskaoyan_mall_groupon record);

    List<Cskaoyan_mall_groupon> getGrouponList(@Param("page") Integer page, @Param("limit") Integer limit,
                                               @Param("goodsId") String goodsId,
                                               @Param("sort") String sort, @Param("order") String order);
}