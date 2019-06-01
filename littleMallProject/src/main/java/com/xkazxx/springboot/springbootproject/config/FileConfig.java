package com.xkazxx.springboot.springbootproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class FileConfig {

    @Bean("multipartResolver")
    public CommonsMultipartResolver commonsMultipartResolver(){
       return new CommonsMultipartResolver();
    }

}
