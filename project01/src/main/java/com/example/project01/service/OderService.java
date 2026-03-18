package com.example.project01.service;
import com.example.project01.payment.PaymentMethod;
import com.example.project01.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OderService {

    private PaymentMethod paymentMethod;
    private NotificationService notificationService;

    @Autowired
    public OderService(@Qualifier("momo") PaymentMethod paymentMethod,@Qualifier("email") NotificationService notificationService) {
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public void processOrder(String customer, String product, double amount) {
        System.out.println("Customer: " + customer);
        System.out.println("Product: " + product);

        paymentMethod.pay(amount);
        notificationService.sendNotification(customer, "Payment successful by " + paymentMethod.getMethodName());
    }
}