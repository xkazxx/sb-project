
package com.xkazxx.springboot.springbootproject.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_adminMapper;
import com.xkazxx.springboot.springbootproject.service.system.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {
    @Autowired
    Cskaoyan_mall_adminMapper cskaoyanMallAdminMapper;

    @Override
    public List<Cskaoyan_mall_admin> findAllAdminByPage(int pageNum, int pageSize) {
        return cskaoyanMallAdminMapper.selectAll(pageNum,pageSize);
    }

    @Override
    public QueryVO findAdminByAdminName(String searchValue, int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum,pageSize);
        List<Cskaoyan_mall_admin> cskaoyanMallLog = cskaoyanMallAdminMapper.selectAdminByAdminName(searchValue, pageNum, pageSize);
        QueryVO queryVO = new QueryVO();
        queryVO.setItems(cskaoyanMallLog );
        //取分页结果
        PageInfo<Cskaoyan_mall_admin> pageInfo = new PageInfo<>(cskaoyanMallLog);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }

    @Override
    public int updateAdminByAdminId(Cskaoyan_mall_admin cskaoyanMallAdmin) {
        return cskaoyanMallAdminMapper.updateByPrimaryKeySelective(cskaoyanMallAdmin);
    }

    @Override
    public int deleteAdminByAdminId(String[] ids) {
        return cskaoyanMallAdminMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public int insertAdmin(Cskaoyan_mall_admin cskaoyanMallAdmin) {
        return cskaoyanMallAdminMapper.insertSelective(cskaoyanMallAdmin);
    }

    @Override
    public int insertStorage(Cskaoyan_mall_storage cskaoyanMallStorage) {
        return cskaoyanMallAdminMapper.insertStorage(cskaoyanMallStorage);
    }
}
