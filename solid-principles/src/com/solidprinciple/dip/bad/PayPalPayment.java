package com.solidprinciple.dip.bad;

//Concrete implementation for PayPal payments
public class PayPalPayment {

	public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
