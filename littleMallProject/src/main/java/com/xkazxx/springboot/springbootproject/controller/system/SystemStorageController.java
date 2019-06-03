
package com.xkazxx.springboot.springbootproject.controller.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.service.StorageService;
import com.xkazxx.springboot.springbootproject.service.system.SystemStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SystemStorageController {
    @Autowired
    SystemStorageService systemStorageService;
    @Autowired
    StorageService storageService;

    @RequestMapping("/storage/list")
    @ResponseBody
    public List<Cskaoyan_mall_storage> findAllStorage(@RequestParam int page,
                                                      @RequestParam int limit){
        return systemStorageService.findAllStorageByPage(page,limit);
    }
    @RequestMapping("/storage/list2")
    @ResponseBody
    public QueryVO findStorageByKey(String searchValue, int page, int limit){
        return systemStorageService.findStorageByKey(searchValue,page,limit);
    }
    @RequestMapping("/storage/list3")
    @ResponseBody
    public QueryVO findStorageByName(String searchValue, int page, int limit){
        return systemStorageService.findStorageByName(searchValue,page,limit);
    }
    @RequestMapping("/storage/create2")
    @ResponseBody
    public Map insert(Cskaoyan_mall_storage cskaoyanMallStorage){
        return storageService.createStorage(cskaoyanMallStorage);
    }
    @RequestMapping("/storage/update")
    @ResponseBody
    public int update(Cskaoyan_mall_storage cskaoyanMallStorage){
        return systemStorageService.updateStorageById(cskaoyanMallStorage);
    }
}
