package com.example.project01.payment;

import org.springframework.stereotype.Component;

@Component("bank")
public class BankTranferPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("(Bank) Transfer: " + amount);
    }

    @Override
    public String getMethodName(){
        return "Bank";
    }
}
