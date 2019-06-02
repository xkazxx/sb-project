package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_topic;
import com.xkazxx.springboot.springbootproject.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topic/list")
    public Map getTopicList(Integer page, Integer limit, String title, String subtitle, String sort,String order){
        return topicService.getTopicList(page, limit, title, subtitle, sort, order);
    }

    @RequestMapping("/topic/create")
    public Map createTopic(@RequestBody Cskaoyan_mall_topic cskaoyanMallTopic){
        return topicService.createTopic(cskaoyanMallTopic);
    }

    @RequestMapping("/topic/update")
    public Map updateTopic(@RequestBody Cskaoyan_mall_topic cskaoyanMallTopic){
        return topicService.updateTopic(cskaoyanMallTopic);
    }

    @RequestMapping("/topic/delete")
    public Map deleteTopic(@RequestBody Cskaoyan_mall_topic cskaoyanMallTopic){
        return topicService.deleteTopic(cskaoyanMallTopic);
    }

}
