package com.xkazxx.springboot.springbootproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.xkazxx.springboot.springbootproject.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apInfo() {
        return new ApiInfoBuilder()
                .title("商城后台系统")
                .description("后台模块")
                .contact("xkazxx")
                .version("1.0")
                .build();
    }


}
