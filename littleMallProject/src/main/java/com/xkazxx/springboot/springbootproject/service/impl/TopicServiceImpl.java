package com.xkazxx.springboot.springbootproject.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_topic;
import com.xkazxx.springboot.springbootproject.mapper.Cskaoyan_mall_topicMapper;
import com.xkazxx.springboot.springbootproject.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    Cskaoyan_mall_topicMapper cskaoyanMallTopicMapper;

    @Override
    public Map getTopicList(Integer page, Integer limit, String title, String subtitle, String sort, String order) {
        PageHelper.startPage(page,limit);
        PageInfo<Cskaoyan_mall_topic> pageInfo = new PageInfo<>( cskaoyanMallTopicMapper.getTopicList(page,limit,title,subtitle,sort,order));
        return getResultMap(pageInfo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)
    public Map createTopic(Cskaoyan_mall_topic cskaoyanMallTopic) {
        Date date = new Date();
        cskaoyanMallTopic.setAddTime(date);
        cskaoyanMallTopic.setUpdateTime(date);
        cskaoyanMallTopic.setDeleted(false);
        cskaoyanMallTopicMapper.insert(cskaoyanMallTopic);

        Map map = new HashMap();
        map.put("errmsg", "成功");
        map.put("data", cskaoyanMallTopicMapper.selectTopicLastone());
        map.put("errno", 0);
        return map;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)
    public Map updateTopic(Cskaoyan_mall_topic cskaoyanMallTopic) {
        cskaoyanMallTopic.setUpdateTime(new Date());
        cskaoyanMallTopicMapper.updateByPrimaryKey(cskaoyanMallTopic);

        Map map = new HashMap();
        map.put("errno", 0);
        map.put("data", cskaoyanMallTopicMapper.selectByPrimaryKey(cskaoyanMallTopic.getId()));
        map.put("errmsg", "成功");
        return map;
    }

    @Override
    public Map deleteTopic(Cskaoyan_mall_topic cskaoyanMallTopic) {
        Map map = new HashMap();
        cskaoyanMallTopicMapper.deleteByPrimaryKey(cskaoyanMallTopic.getId());
        map.put("errno", 0);
        map.put("errmsg", "成功");
        return map;
    }


    public Map getResultMap(PageInfo pageInfo) {
        Map data = new HashMap();
        Map map = new HashMap();
        data.put("items", pageInfo.getList());
        data.put("total", pageInfo.getTotal());
        map.put("errmsg", "成功");
        map.put("data", data);
        map.put("errno", 0);
        return map;
    }
}
