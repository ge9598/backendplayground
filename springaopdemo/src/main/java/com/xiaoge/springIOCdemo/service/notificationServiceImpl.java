package com.xiaoge.springIOCdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class notificationServiceImpl implements NotificationService{

    @Autowired
    //if there is multiple bean, use qualifier to distinguish
    //The default autowiring is by type, not by name, so when there is more than one bean of the same type, you have to use the @Qualifier annotation
    @Qualifier("getTemplate2")
    String template;

    @Override
    public void sendNotification(String s) {
        System.out.println("Notification sent " + template);
    }
}
