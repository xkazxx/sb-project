package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_ad;
import com.xkazxx.springboot.springbootproject.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

@RestController
public class AdController {

    @Autowired
    AdService adService;

    @RequestMapping("/ad/list")
    public Map getAdList(Integer page, Integer limit, String name, String content, String sort, String order) {
        return adService.getAdList(page, limit, name, content, sort, order);
    }

    @RequestMapping("/ad/delete")
    public Map deleteAd(@NotNull Cskaoyan_mall_ad cskaoyanMallAd) {
        return adService.deleteAd(cskaoyanMallAd);
    }

    @RequestMapping("/ad/update")
    public Map updateAd(@RequestBody Cskaoyan_mall_ad cskaoyanMallAd) {
        return adService.updateAd(cskaoyanMallAd);
    }

    @RequestMapping("/ad/create")
    public Map createAd(@RequestBody Cskaoyan_mall_ad cskaoyanMallAd) {
        return adService.createAd(cskaoyanMallAd);
    }

}
