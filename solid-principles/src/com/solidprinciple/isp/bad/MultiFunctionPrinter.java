package com.solidprinciple.isp.bad;

public class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document doc) {
        // Print logic
    }

    @Override
    public void scan(Document doc) {
        // Scan logic
    }

    @Override
    public void fax(Document doc) {
        // Fax logic
    }
}
