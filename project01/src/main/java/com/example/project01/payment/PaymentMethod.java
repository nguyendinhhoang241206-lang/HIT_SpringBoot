package com.example.project01.payment;

public interface PaymentMethod {
    public void pay(double amount);
    public String getMethodName();
}
