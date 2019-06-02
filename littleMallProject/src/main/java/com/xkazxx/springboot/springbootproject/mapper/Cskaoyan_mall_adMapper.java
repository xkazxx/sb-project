package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_ad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_adMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_ad record);

    int insertSelective(Cskaoyan_mall_ad record);

    Cskaoyan_mall_ad selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_ad record);

    int updateByPrimaryKey(Cskaoyan_mall_ad record);

    List<Cskaoyan_mall_ad> getAdList(@Param("page") Integer page, @Param("limit") Integer limit,
                                     @Param("name") String name, @Param("content") String content,
                                     @Param("sort") String sort, @Param("order") String order);

    Cskaoyan_mall_ad selectAdLastone();
}