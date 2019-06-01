
package com.xkazxx.springboot.springbootproject.service.system.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_log;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_logMapper;
import com.xkazxx.springboot.springbootproject.service.system.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemLogServiceImpl implements SystemLogService {
    @Autowired
    Cskaoyan_mall_logMapper cskaoyanMallLogMapper;

    @Override
    public  List<Cskaoyan_mall_log> findAllLogByPage(int pageNum, int pageSize) {
        return cskaoyanMallLogMapper.selectAll(pageNum, pageSize);
    }

    @Override
    public QueryVO selectLogByAdmin(String searchValue, int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        List<Cskaoyan_mall_log> cskaoyanMallLog = cskaoyanMallLogMapper.selectLogByAdmin(searchValue,pageNum,pageSize);
        QueryVO queryVO = new QueryVO();
        queryVO.setItems(cskaoyanMallLog );
        //取分页结果
        PageInfo<Cskaoyan_mall_log> pageInfo = new PageInfo<>(cskaoyanMallLog);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
        return queryVO;
    }
}
