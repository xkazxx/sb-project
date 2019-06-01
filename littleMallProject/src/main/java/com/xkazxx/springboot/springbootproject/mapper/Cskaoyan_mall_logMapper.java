package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_logMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskaoyan_mall_log record);

    int insertSelective(Cskaoyan_mall_log record);

    Cskaoyan_mall_log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_log record);

    int updateByPrimaryKey(Cskaoyan_mall_log record);

    List<Cskaoyan_mall_log> selectAll(@Param("pageNum") int pageNum,
                                      @Param("pageSize") int pageSize);
    List<Cskaoyan_mall_log> selectLogByAdmin(@Param("admin") String searchValue,
                                             @Param("pageNum") int pageNum,
                                             @Param("pageSize") int pageSize);
}