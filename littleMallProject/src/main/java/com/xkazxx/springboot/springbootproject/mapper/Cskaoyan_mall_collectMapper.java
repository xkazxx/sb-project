package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_collectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_collect record);

    int insertSelective(Cskaoyan_mall_collect record);

    Cskaoyan_mall_collect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_collect record);

    int updateByPrimaryKey(Cskaoyan_mall_collect record);

    List<Cskaoyan_mall_collect> getCollectList(@Param("page") Integer page, @Param("limit") Integer limit,
                                @Param("userId") Integer userId, @Param("valueId") Integer valueId);
}