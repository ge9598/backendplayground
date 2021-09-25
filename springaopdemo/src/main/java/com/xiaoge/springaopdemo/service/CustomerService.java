package com.xiaoge.springaopdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;



@Service //@Component //@ Controller // @Repository
@Scope("prototype")
public class CustomerService {
    //To complete dependency Injection
    //Method 1: Directly autowired the variable, AKA Field Injection
    @Autowired
    @Qualifier("notificationServiceImpl")
    private NotificationService notificationService;
    //Method 2: Constructor Injection
//    @Autowired
//    public CustomerService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
    //Method: 3 Setter Injection
//    @Autowired
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    public void register(){

        notificationService.sendNotification("Congrats on successfully send notification!");

    }


}
