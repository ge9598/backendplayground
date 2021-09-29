package com.xiaoge.springanootation.DAO;

import com.xiaoge.springanootation.Service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sports.properties")
public class TableTennisCoach implements Coach{
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String name;
    private FortuneService fortuneService;

    public TableTennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "pingpong number one!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
