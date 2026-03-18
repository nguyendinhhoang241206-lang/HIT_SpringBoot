package com.example.project01.payment;

import org.springframework.stereotype.Component;

@Component("momo")
public class MomoPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("(Momo) Transfer: " + amount);
    }

    @Override
    public String getMethodName(){
        return "Momo";
    }
}
