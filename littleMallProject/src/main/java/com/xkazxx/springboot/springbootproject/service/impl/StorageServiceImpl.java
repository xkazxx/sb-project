package com.xkazxx.springboot.springbootproject.service.impl;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_storageMapper;
import com.xkazxx.springboot.springbootproject.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StorageServiceImpl implements StorageService {


    @Autowired
    Cskaoyan_mall_storageMapper cskaoyanMallStorageMapper;

    @Override
    public Map createStorage(Cskaoyan_mall_storage cskaoyanMallStorage) {
        cskaoyanMallStorageMapper.insertSelective(cskaoyanMallStorage);
        Map map = new HashMap();
        map.put("data", cskaoyanMallStorage);
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }

}
