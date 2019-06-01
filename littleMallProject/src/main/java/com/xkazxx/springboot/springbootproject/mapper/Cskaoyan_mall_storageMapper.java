package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_storageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_storage record);

    int insertSelective(Cskaoyan_mall_storage record);

    Cskaoyan_mall_storage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_storage record);

    int updateByPrimaryKey(Cskaoyan_mall_storage record);

    List<Cskaoyan_mall_storage> selectAll(@Param("pageNum") int pageNum,
                                          @Param("pageSize") int pageSize);
    List<Cskaoyan_mall_storage> selectStorageByKey(@Param("key") String searchValue,
                                                   @Param("pageNum") int pageNum,
                                                   @Param("pageSize") int pageSize);
    List<Cskaoyan_mall_storage> selectStorageByName(@Param("name") String searchValue,
                                                    @Param("pageNum") int pageNum,
                                                    @Param("pageSize") int pageSize);
}