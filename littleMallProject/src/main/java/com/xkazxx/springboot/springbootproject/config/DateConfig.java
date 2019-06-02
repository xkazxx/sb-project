package com.xkazxx.springboot.springbootproject.config;

import com.xkazxx.springboot.springbootproject.myDateConverter.MyDateConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class DateConfig implements WebMvcConfigurer {

    @Bean
    public ConversionService getConversionService(MyDateConverter dateConverter){
        ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();

        Set<Converter> converters = new HashSet<>();

        converters.add(dateConverter);

        factoryBean.setConverters(converters);

        return factoryBean.getObject();
    }

}
