package com.xiaoge.springanootation.DAO;


import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice the backhand";

    }
}
