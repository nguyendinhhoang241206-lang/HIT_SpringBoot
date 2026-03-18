package com.example.project01.payment;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("(Cash) Pay: " + amount);
    }

    @Override
    public String getMethodName(){
        return "Cash";
    }
}
