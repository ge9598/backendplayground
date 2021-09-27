package com.xiaoge.springanootation;

import com.xiaoge.springanootation.DAO.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringanootationApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ac;
    public static void main(String[] args) {

        SpringApplication.run(SpringanootationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Coach c = ac.getBean(Coach.class,"thatCoach");
        System.out.println(c.getDailyWorkout());
    }
}
