package com.xiaoge.springIOCdemo.service;

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
