package com.xiaoge.springanootation.DAO;

import com.xiaoge.springanootation.Service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "pingpong number one!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
