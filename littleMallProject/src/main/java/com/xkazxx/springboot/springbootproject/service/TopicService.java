package com.xkazxx.springboot.springbootproject.service;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_topic;

import java.util.Map;

public interface TopicService {
    Map getTopicList(Integer page, Integer limit, String title, String subtitle, String sort, String order);

    Map createTopic(Cskaoyan_mall_topic cskaoyanMallTopic);

    Map updateTopic(Cskaoyan_mall_topic cskaoyanMallTopic);

    Map deleteTopic(Cskaoyan_mall_topic cskaoyanMallTopic);
}
