package com.xkazxx.springboot.springbootproject.service.system;


import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_log;
import com.xkazxx.springboot.springbootproject.bean.*;

import java.util.List;


public interface SystemLogService{

    //显示所有操作日志
    List<Cskaoyan_mall_log> findAllLogByPage(int pageNum, int pageSize);

    //根据操作管理员搜索
    QueryVO selectLogByAdmin(String searchValue, int pageNum, int pageSize);

}
