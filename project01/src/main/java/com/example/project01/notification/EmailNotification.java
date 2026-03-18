package com.example.project01.notification;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("(Email) To: " + to + " | " + message);
    }
}
