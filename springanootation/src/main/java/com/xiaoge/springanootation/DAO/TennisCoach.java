package com.xiaoge.springanootation.DAO;


import com.xiaoge.springanootation.Service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("thatCoach")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("fromFileFortuneService")
    private FortuneService fortuneService;

//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
//
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
//
    @PostConstruct
    public void startUp(){
        System.out.println("TennisCoach: inside startUp(Post Construct)");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("TennisCoach: inside before destroy(Pre Destroy)");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice the backhand";

    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
