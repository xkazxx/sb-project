
package com.xkazxx.springboot.springbootproject.controller.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.service.system.SystemStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SystemStorageController {
    @Autowired
    SystemStorageService systemStorageService;

    @RequestMapping("/admin/storage/list")
    @ResponseBody
    public List<Cskaoyan_mall_storage> findAllStorage(@RequestParam int page,
                                                      @RequestParam int items){
        return systemStorageService.findAllStorageByPage(page,items);
    }
    @RequestMapping("/admin/storage/list")
    @ResponseBody
    public QueryVO findStorageByKey(String searchValue, int page, int items){
        return systemStorageService.findStorageByKey(searchValue,page,items);
    }
    @RequestMapping("/admin/storage/list")
    @ResponseBody
    public QueryVO findStorageByName(String searchValue, int page, int items){
        return systemStorageService.findStorageByName(searchValue,page,items);
    }
    @RequestMapping("/admin/storage/create")
    @ResponseBody
    public int inset(Cskaoyan_mall_storage cskaoyanMallStorage){
        return systemStorageService.insertStorage(cskaoyanMallStorage);
    }
    @RequestMapping("/admin/storage/update")
    @ResponseBody
    public int update(Cskaoyan_mall_storage cskaoyanMallStorage){
        return systemStorageService.updateStorageById(cskaoyanMallStorage);
    }
}
