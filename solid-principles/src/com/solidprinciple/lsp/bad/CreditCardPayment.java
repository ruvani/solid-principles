package com.solidprinciple.lsp.bad;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Additional logic for credit card payment
    }

    public void authorize() {
        System.out.println("Authorizing credit card: " + cardNumber);
    }
}
