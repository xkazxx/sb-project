package com.xkazxx.springboot.springbootproject.service;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_ad;

import java.util.Map;

public interface AdService {

    Map getAdList(Integer page, Integer limit, String name, String content, String sort, String order);


    Map deleteAd(Cskaoyan_mall_ad cskaoyanMallAd);

    Map createAd(Cskaoyan_mall_ad cskaoyanMallAd);

    Map updateAd(Cskaoyan_mall_ad cskaoyanMallAd);
}
