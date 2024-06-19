package com.solidprinciple.dip.bad;

//Concrete implementation for credit card payments
public class CreditCardPayment {

	public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}