package com.xiaoge.springanootation;

import com.xiaoge.springanootation.DAO.Coach;
import com.xiaoge.springanootation.DAO.TableTennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringanootationApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ac;
    public static void main(String[] args) {

        SpringApplication.run(SpringanootationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        TableTennisCoach c = ac.getBean("tableTennisCoach", TableTennisCoach.class);
        System.out.println(c.getDailyWorkout());
        System.out.println(c.getDailyFortune());
        System.out.println(c.getEmail());
        System.out.println(c.getName());
        ((ConfigurableApplicationContext)ac).close();
    }
}
