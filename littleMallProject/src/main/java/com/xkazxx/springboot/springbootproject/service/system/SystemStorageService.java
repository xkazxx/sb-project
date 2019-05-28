package com.xkazxx.springboot.springbootproject.service.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;

import java.util.List;

public interface SystemStorageService {
    //显示所有存储管理
    List<Cskaoyan_mall_storage> findAllStorageByPage( int pageNum, int pageSize);
    QueryVO findStorageByKey(String searchValue, int pageNum, int pageSize);
    QueryVO findStorageByName(String searchValue, int pageNum, int pageSize);

    int updateStorageById(Cskaoyan_mall_storage cskaoyanMallStorage);
    int insertStorage(Cskaoyan_mall_storage cskaoyanMallStorage);
}
