package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_adminMapper {
    int deleteByPrimaryKey(@Param("ids") String[] ids);

    int insert(Cskaoyan_mall_admin record);

    int insertSelective(Cskaoyan_mall_admin record);

    Cskaoyan_mall_admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_admin record);

    int updateByPrimaryKey(Cskaoyan_mall_admin record);
    //自己增加的
    List<Cskaoyan_mall_admin> selectAll(@Param("pageNum") int pageNum,
                                        @Param("pageSize") int pageSize);
    List<Cskaoyan_mall_admin> selectAdminByAdminName(@Param("name") String searchValue,
                                                     @Param("pageNum") int pageNum,
                                                     @Param("pageSize") int pageSize);
 /*   List<Cskaoyan_mall_admin> select(@Param("username") String username);*/
    int insertStorage(Cskaoyan_mall_storage record);

}