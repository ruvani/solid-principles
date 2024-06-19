package com.solidprinciple.lsp.bad;

public class Main {
	public static void main(String[] args) {
        Payment payment = new CreditCardPayment("1234-5678-9876-5432");
        payment.makePayment(100.0); // Works fine
        
        // This would cause a runtime error because the authorize method is not available in the Payment class
        if (payment instanceof CreditCardPayment) {
            ((CreditCardPayment) payment).authorize();
        }
    }
}
