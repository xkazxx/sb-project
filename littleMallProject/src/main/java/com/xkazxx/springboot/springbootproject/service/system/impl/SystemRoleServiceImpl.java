
package com.xkazxx.springboot.springbootproject.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_role;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_roleMapper;
import com.xkazxx.springboot.springbootproject.service.system.SystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemRoleServiceImpl implements SystemRoleService {
    @Autowired
    Cskaoyan_mall_roleMapper cskaoyanMallRoleMapper;

    @Override
    public List<Cskaoyan_mall_role> findAllRoleByPage(int pageNum, int pageSize) {
        return cskaoyanMallRoleMapper.selectAll(pageNum, pageSize);
    }

    @Override
    public QueryVO findRoleByRoleName(String searchValue, int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum,pageSize);
        List<Cskaoyan_mall_role> cskaoyanMalRole = cskaoyanMallRoleMapper.selectRoleByRollName(searchValue,pageNum,pageSize);
        QueryVO queryVO = new QueryVO();
        queryVO.setItems(cskaoyanMalRole);
        //取分页结果
        PageInfo<Cskaoyan_mall_role> pageInfo = new PageInfo<>(cskaoyanMalRole);
        //取总记录数
        int total = (int) pageInfo.getTotal();
        queryVO.setTotal(total);
      /*  方法二
       Map map = new HashMap();
       map.put("items", pageInfo.getList());
       map.put("total",pageInfo.getTotal());*/
        return queryVO;
    }

    @Override
    public int updateRoleByRoleId(Cskaoyan_mall_role cskaoyanMallRole) {
        return cskaoyanMallRoleMapper.updateByPrimaryKeySelective(cskaoyanMallRole);
    }

    @Override
    public int deleteRoleByRoleId(String[] ids) {
        return cskaoyanMallRoleMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public int givePermissionByRoleId(Cskaoyan_mall_role cskaoyanMallRole) {
        return 0;
    }

    @Override
    public int insertRole(Cskaoyan_mall_role cskaoyanMallRole) {
        return cskaoyanMallRoleMapper.insertSelective(cskaoyanMallRole);
    }
}
