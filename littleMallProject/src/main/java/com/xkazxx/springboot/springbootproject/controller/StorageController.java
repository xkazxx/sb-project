package com.xkazxx.springboot.springbootproject.controller;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_storage;
import com.xkazxx.springboot.springbootproject.service.StorageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    @Autowired
    Cskaoyan_mall_storage cskaoyanMallStorage;

    @RequestMapping("/storage/create")
    public Map createStorage(MultipartFile file, HttpServletRequest request) throws IOException {
        String filename = file.getOriginalFilename();
        String key = UUID.nameUUIDFromBytes(filename.getBytes()) + filename.substring(filename.lastIndexOf("."));
        String url = "http://192.168.5.57:80" + request.getContextPath() + "/storage/fetch/";
        Date date = new Date();
        cskaoyanMallStorage.setId(null);
        cskaoyanMallStorage.setAddTime(date);
        cskaoyanMallStorage.setDeleted(false);
        cskaoyanMallStorage.setName(filename);
        cskaoyanMallStorage.setSize((int) file.getSize());
        cskaoyanMallStorage.setType(file.getContentType());
        cskaoyanMallStorage.setKey(key);
        cskaoyanMallStorage.setUpdateTime(date);
        cskaoyanMallStorage.setUrl(url + key);
        file.transferTo(new File("E:/file/" + key));
        return storageService.createStorage(cskaoyanMallStorage);
    }

    @RequestMapping("/storage/fetch/{fileName}")
    public byte[] fetchImage(@PathVariable("fileName") String fileName, HttpServletResponse response){
        String path = "E:/file/" + fileName;
        File file = new File(path);
        byte[] allBytes = null;
        try {
            allBytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Logger.getLogger(this.getClass()).info(e.getMessage());
        }
        return allBytes;
    }
}
