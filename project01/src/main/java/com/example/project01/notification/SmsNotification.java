package com.example.project01.notification;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements NotificationService{
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("(SMS) To: " + to + " | " + message);
    }
}
