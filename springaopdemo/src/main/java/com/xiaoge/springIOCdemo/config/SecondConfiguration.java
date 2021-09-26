package com.xiaoge.springIOCdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfiguration {
    @Bean

    public String getTemplate2(){
        return "hello2";
    }
}
