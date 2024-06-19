package com.solidprinciple.dip.bad;

public class Main {

	public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processCreditCardPayment(100.0);
        paymentProcessor.processPayPalPayment(200.0);
    }
}