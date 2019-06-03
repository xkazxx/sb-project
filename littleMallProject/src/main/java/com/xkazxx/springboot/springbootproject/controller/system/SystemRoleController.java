/**
 **/
package com.xkazxx.springboot.springbootproject.controller.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_role;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.service.system.SystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SystemRoleController {
    @Autowired
    SystemRoleService systemRollService;

    @RequestMapping("/admin/role/list")
    @ResponseBody
    public List<Cskaoyan_mall_role> findAllRoleByPage(@RequestParam("page") int page,
                                                      @RequestParam("items") int items){
        return systemRollService.findAllRoleByPage(page,items);
    }
    @RequestMapping("/admin/role/list")
    @ResponseBody
    public QueryVO findRoleByRoleName(String searchValue, int page, int items){
        return systemRollService.findRoleByRoleName(searchValue,page, items);
    }
    @RequestMapping("/admin/role/create")
    @ResponseBody
    public int insert(Cskaoyan_mall_role cskaoyanMallRole){
        return systemRollService.insertRole(cskaoyanMallRole);
    }
    @RequestMapping("/admin/role/update")
    @ResponseBody
    public int update(Cskaoyan_mall_role cskaoyanMallRole){
        return systemRollService.updateRoleByRoleId(cskaoyanMallRole);
    }
    @RequestMapping("/admin/role/delete")
    @ResponseBody
    public int delete(String[] ids){
        return systemRollService.deleteRoleByRoleId(ids);
    }
    /*
    授权---有点难
    */
    @RequestMapping("/admin/role/permissions")
    @ResponseBody
    public void givePermissionsById(Cskaoyan_mall_role cskaoyanMallRole){
        return ;
    }
}
