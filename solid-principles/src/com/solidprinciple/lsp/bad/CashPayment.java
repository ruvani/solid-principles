package com.solidprinciple.lsp.bad;

public class CashPayment extends Payment {
    
	@Override
    public void makePayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
