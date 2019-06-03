/**
 **/
package com.xkazxx.springboot.springbootproject.controller.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.service.system.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SystemAdminController {
    @Autowired
    SystemAdminService systemAdminService;

    @RequestMapping("/admin/list")
    @ResponseBody
    public List<Cskaoyan_mall_admin> findAllAdminByPage(@RequestParam int page,
                                                        @RequestParam int limit){
        return systemAdminService.findAllAdminByPage(page,limit);
    }
    @RequestMapping("/admin/list2")
    @ResponseBody
    public QueryVO findAdminByAdminName(String searchValue, int page, int limit){
        return systemAdminService.findAdminByAdminName(searchValue,page,limit);
    }
    @RequestMapping("/admin/create")
    @ResponseBody
    public int insertAdmin(Cskaoyan_mall_admin cskaoyanMallAdmin){
        return systemAdminService.insertAdmin(cskaoyanMallAdmin);
    }
    @RequestMapping(" /storage/create")
    @ResponseBody
    public int insertStorage(Cskaoyan_mall_storage cskaoyanMallStorage){
        return systemAdminService.insertStorage(cskaoyanMallStorage);
    }
    @RequestMapping("/admin/update")
    @ResponseBody
    public int update(Cskaoyan_mall_admin cskaoyanMallAdmin){
        return systemAdminService.updateAdminByAdminId(cskaoyanMallAdmin);
    }
    @RequestMapping("/admin/delete")
    @ResponseBody
    public int delete(String[] ids){
        return systemAdminService.deleteAdminByAdminId(ids);
    }

}
