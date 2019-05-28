/**
 **/
package com.xkazxx.springboot.springbootproject.service.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_role;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;

import java.util.List;

public interface SystemRoleService {
    //显示所有角色管理
    List<Cskaoyan_mall_role> findAllRoleByPage(int pageNum, int pageSize);
    //根据角色名进行搜索
    QueryVO findRoleByRoleName(String searchValue, int pageNum, int pageSize);
    int updateRoleByRoleId(Cskaoyan_mall_role cskaoyanMallRole);
    int deleteRoleByRoleId(String[] ids);
    int givePermissionByRoleId(Cskaoyan_mall_role cskaoyanMallRole);
    int insertRole(Cskaoyan_mall_role cskaoyanMallRole);

}
