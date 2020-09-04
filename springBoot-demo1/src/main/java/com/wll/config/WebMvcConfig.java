package com.wll.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将E:\temp\的访问映射到/pic/**路径
        registry.addResourceHandler("/pic/**").addResourceLocations("file:E:\\image\\");
        

    }
    
}