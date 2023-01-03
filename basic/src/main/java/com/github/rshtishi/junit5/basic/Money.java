package com.github.rshtishi.junit5.basic;

public class Money {

    private double amount;
    private String ccy;

    public Money(double amount, String ccy) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (ccy == null || ccy.isEmpty()) {
            throw new IllegalArgumentException("CCY cannot be undefined");
        }
        this.amount = amount;
        this.ccy = ccy;
    }


    public double getAmount() {
        return amount;
    }

    public String getCcy() {
        return ccy;
    }
}
