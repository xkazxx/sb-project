package com.xkazxx.springboot.springbootproject.service.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;

import java.util.List;

public interface SystemAdminService {
    //显示所有角色管理
    List<Cskaoyan_mall_admin> findAllAdminByPage(int pageNum, int pageSize);
    //根据角色名进行搜索
    QueryVO findAdminByAdminName(String searchValue, int pageNum, int pageSize);
    int updateAdminByAdminId(Cskaoyan_mall_admin cskaoyanMallAdmin);
    int deleteAdminByAdminId(String[] ids);
    int insertAdmin(Cskaoyan_mall_admin cskaoyanMallAdmin);
    int insertStorage(Cskaoyan_mall_storage cskaoyanMallStorage);
}
