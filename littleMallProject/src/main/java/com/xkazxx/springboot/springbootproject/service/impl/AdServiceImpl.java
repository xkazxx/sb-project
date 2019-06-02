package com.xkazxx.springboot.springbootproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_ad;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_adMapper;
import com.xkazxx.springboot.springbootproject.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    Cskaoyan_mall_adMapper cskaoyanMallAdMapper;

    @Override
    public Map getAdList(Integer page, Integer limit, String name, String content, String sort, String order) {
        PageHelper.startPage(page, limit);
        PageInfo<Cskaoyan_mall_ad> pageInfo =
                new PageInfo<>(cskaoyanMallAdMapper.getAdList(page, limit, name, content, sort, order));
        return getResultMap(pageInfo);
    }

    @Override
    public Map deleteAd(Cskaoyan_mall_ad cskaoyanMallAd) {
        cskaoyanMallAdMapper.deleteByPrimaryKey(cskaoyanMallAd.getId());
        Map map = new HashMap();
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)
    public Map createAd(Cskaoyan_mall_ad cskaoyanMallAd) {
        Date date = new Date();
        cskaoyanMallAd.setAddTime(date);
        cskaoyanMallAd.setUpdateTime(date);
        cskaoyanMallAdMapper.insertSelective(cskaoyanMallAd);
        Map map = new HashMap();
        map.put("data", cskaoyanMallAdMapper.selectAdLastone());
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)
    public Map updateAd(Cskaoyan_mall_ad cskaoyanMallAd) {
        cskaoyanMallAd.setUpdateTime(new Date());
        cskaoyanMallAdMapper.updateByPrimaryKeySelective(cskaoyanMallAd);

        Map map = new HashMap();
        map.put("data", cskaoyanMallAdMapper.selectByPrimaryKey(cskaoyanMallAd.getId()));
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }

    public Map getResultMap(PageInfo pageInfo) {
        Map data = new HashMap();
        Map map = new HashMap();
        data.put("total", pageInfo.getTotal());
        data.put("items", pageInfo.getList());
        map.put("data", data);
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }
}
