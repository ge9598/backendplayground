package com.xiaoge.springanootation.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "today is your lucky day i guess";
    }
}
