package com.xiaoge.springIOCdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    public String getTemplate(){
        return "hello";
    }
}
