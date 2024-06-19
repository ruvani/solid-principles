package com.solidprinciple.dip.bad;

//PaymentProcessor depends on concrete implementations
public class PaymentProcessor {
	 
	private CreditCardPayment creditCardPayment;
	    private PayPalPayment payPalPayment;

	    public PaymentProcessor() {
	        this.creditCardPayment = new CreditCardPayment();
	        this.payPalPayment = new PayPalPayment();
	    }

	    public void processCreditCardPayment(double amount) {
	        creditCardPayment.processPayment(amount);
	    }

	    public void processPayPalPayment(double amount) {
	        payPalPayment.processPayment(amount);
	    }
}