package com.xkazxx.springboot.springbootproject.mapper;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cskaoyan_mall_roleMapper {
    int deleteByPrimaryKey(@Param("ids") String[] ids);

    int insert(Cskaoyan_mall_role record);

    int insertSelective(Cskaoyan_mall_role record);

    Cskaoyan_mall_role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskaoyan_mall_role record);

    int updateByPrimaryKey(Cskaoyan_mall_role record);
    //自己增加的
    List<Cskaoyan_mall_role> selectAll(@Param("pageNum") int pageNum,
                                       @Param("pageSize") int pageSize);
    List<Cskaoyan_mall_role> selectRoleByRollName(@Param("name") String searchValue,
                                                  @Param("pageNum") int pageNum,
                                                  @Param("pageSize") int pageSize);
    //不太懂
    int givePermissionByRoleId();

}