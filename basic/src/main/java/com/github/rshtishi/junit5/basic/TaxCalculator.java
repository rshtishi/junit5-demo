package com.github.rshtishi.junit5.basic;


public class TaxCalculator {

    public double calculate(double amount) {
        if (amount <= 40000) {
            return 0;
        } else if (amount > 40000 && amount <= 100000) {
            return amount * 0.15;
        } else {
            return amount * 0.3;
        }
    }
}
