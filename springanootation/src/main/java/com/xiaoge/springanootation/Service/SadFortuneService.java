package com.xiaoge.springanootation.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "u r out of luck!!!!";
    }
}
