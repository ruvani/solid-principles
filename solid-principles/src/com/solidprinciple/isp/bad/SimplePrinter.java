package com.solidprinciple.isp.bad;

public class SimplePrinter implements Machine {
    @Override
    public void print(Document doc) {
        // Print logic
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax(Document doc) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
