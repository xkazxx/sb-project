
package com.xkazxx.springboot.springbootproject.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_storageMapper;
import com.xkazxx.springboot.springbootproject.service.system.SystemStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStorageServiceImpl implements SystemStorageService {
    @Autowired
    Cskaoyan_mall_storageMapper cskaoyanMallStorageMapper;

    @Override
    public List<Cskaoyan_mall_storage> findAllStorageByPage(int pageNum, int pageSize) {
        return cskaoyanMallStorageMapper.selectAll(pageNum,pageSize);
    }

    @Override
    public QueryVO findStorageByKey(String searchValue,int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        List<Cskaoyan_mall_storage> cskaoyanMalRole = cskaoyanMallStorageMapper.selectStorageByKey(searchValue,pageNum,pageSize);
        QueryVO queryVO = new QueryVO();
        queryVO.setItems(cskaoyanMalRole);
        //取分页结果
        PageInfo<Cskaoyan_mall_storage> pageInfo = new PageInfo<>(cskaoyanMalRole);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }

    @Override
    public QueryVO findStorageByName(String searchValue,int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        List<Cskaoyan_mall_storage> cskaoyanMalRole = cskaoyanMallStorageMapper.selectStorageByName(searchValue,pageNum,pageSize);
        QueryVO queryVO = new QueryVO();
        queryVO.setItems(cskaoyanMalRole);
        //取分页结果
        PageInfo<Cskaoyan_mall_storage> pageInfo = new PageInfo<>(cskaoyanMalRole);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }

    @Override
    public int updateStorageById(Cskaoyan_mall_storage cskaoyanMallStorage) {
        return cskaoyanMallStorageMapper.updateByPrimaryKeySelective(cskaoyanMallStorage);
    }

    @Override
    public int insertStorage(Cskaoyan_mall_storage cskaoyanMallStorage) {
        return cskaoyanMallStorageMapper.insert(cskaoyanMallStorage);
    }
}
