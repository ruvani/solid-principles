
package com.solidprinciple.srp.bad;

public class Invoice {

	private String id;
    private double amount;

    public Invoice(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    // Responsibility 1: Calculate the total amount
    public double calculateTotal() {
        // logic to calculate total amount
        return amount * 1.2; 
    }

    // Responsibility 2: Print the invoice
    public void printInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Total Amount: " + calculateTotal());
    }

    // Responsibility 3: Save the invoice to the database
    public void saveToDatabase() {
        // logic to save invoice to database
        System.out.println("Saving invoice to database...");
    }
}
