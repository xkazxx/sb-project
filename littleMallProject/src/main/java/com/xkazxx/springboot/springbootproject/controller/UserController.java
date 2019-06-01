package com.xkazxx.springboot.springbootproject.controller;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectRequest;
import com.xkazxx.springboot.springbootproject.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    @RequiresPermissions("user:query")
    public Map getUserList(Integer page, Integer limit, String username, String mobile) {
        return userService.getUserList(page, limit, username, mobile);
    }

    @RequestMapping("/address/list")
    public Map getAddressList(Integer page, Integer limit, Integer userId, String name) {
        return userService.getAddressList(page, limit, userId, name);
    }

    @RequestMapping("/collect/list")
    public Map getCollectList(Integer page, Integer limit, Integer userId, Integer valueId) {
        return userService.getCollectList(page, limit, userId, valueId);
    }

    @RequestMapping("/footprint/list")
    public Map getFootprintList(Integer page, Integer limit, Integer userId, Integer goodsId) {
        return userService.getFootprintList(page, limit, userId, goodsId);
    }

    @RequestMapping("/history/list")
    public Map getSearchHistoryList(Integer page, Integer limit, Integer userId, String keyword) {
        return userService.getSearchHistoryList(page, limit, userId, keyword);
    }

    @RequestMapping("/feedback/list")
    public Map getFeedbackList(Integer page, Integer limit, Integer id, String username) {
        return userService.getFeedbackList(page, limit, id, username);
    }

    @RequestMapping("/uploadFile")
    @ResponseBody
    public String uploadFile(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        String contentType = file.getContentType();
        long size = file.getSize();
        String originalFilename = file.getOriginalFilename();

        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(size);
        objectMetadata.setContentType(contentType);

        String bucketName = "cskaoyan";
        String key = UUID.randomUUID().toString().replace("-","");
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, inputStream, objectMetadata);
        String endPoint = "oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI8EgTxlc4QQZr";
        String secretAccessKey = "RBDvSGZOR8DaUJxlLrW4Ed46RVnAkR";
        OSSClient ossClient = new OSSClient(endPoint, accessKeyId, secretAccessKey);
        ossClient.putObject(putObjectRequest);
        return "ok";
    }


}
