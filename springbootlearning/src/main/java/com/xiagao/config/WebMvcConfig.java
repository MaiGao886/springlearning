package com.xiagao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")                                                     // 允许跨域访问的路径
//              .allowedOrigins("*")                                                                //允许跨域访问的源
//              .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")                          //允许请求方法
//              .allowedHeaders("header1", "header2", "header3")                                    //允许头部设置
//              .exposedHeaders("header1", "header2")
                .allowCredentials(false)                                                           //是否发送cookie
                .maxAge(3600);                                                                     //预检间隔时间
    }
}
