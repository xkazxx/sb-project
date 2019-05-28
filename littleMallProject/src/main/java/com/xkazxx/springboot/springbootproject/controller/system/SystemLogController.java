
package com.xkazxx.springboot.springbootproject.controller.system;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_log;
import com.xkazxx.springboot.springbootproject.bean.QueryVO;
import com.xkazxx.springboot.springbootproject.service.system.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SystemLogController {
    @Autowired
    SystemLogService  systemLogService;

    @RequestMapping("/admin/log/list")
    @ResponseBody
    public List<Cskaoyan_mall_log> findAllLogByPage(@RequestParam int page,
                                                    @RequestParam int items){

        return systemLogService.findAllLogByPage(page,items);
    }

    @RequestMapping("/admin/log/list")
    @ResponseBody
    public QueryVO selectLogByAdmin(String searchValue,int page, int items){
        return systemLogService.selectLogByAdmin(searchValue,page,items);
    }
}
