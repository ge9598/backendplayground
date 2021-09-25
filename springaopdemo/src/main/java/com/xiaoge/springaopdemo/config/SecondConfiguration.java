package com.xiaoge.springaopdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SecondConfiguration {
    @Bean

    public String getTemplate2(){
        return "hello2";
    }
}
