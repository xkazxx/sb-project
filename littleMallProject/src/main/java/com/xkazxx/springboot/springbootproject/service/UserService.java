package com.xkazxx.springboot.springbootproject.service;

import java.util.Map;

public interface UserService {
    Map getUserList(Integer page, Integer limit, String username, String mobile);

    Map getAddressList(Integer page, Integer limit, Integer userId, String name);

    Map getCollectList(Integer page, Integer limit, Integer userId, Integer valueId);

    Map getFootprintList(Integer page, Integer limit, Integer userId, Integer goodsId);

    Map getSearchHistoryList(Integer page, Integer limit, Integer userId, String keyword);


    Map getFeedbackList(Integer page, Integer limit, Integer id, String username);
}
