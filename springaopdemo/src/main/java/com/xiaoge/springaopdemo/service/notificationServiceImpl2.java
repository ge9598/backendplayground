package com.xiaoge.springaopdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class notificationServiceImpl2 implements NotificationService{



    @Override
    public void sendNotification(String s) {
        System.out.println("Email Sent with load" + s);
    }
}
