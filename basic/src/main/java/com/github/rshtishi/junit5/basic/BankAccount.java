package com.github.rshtishi.junit5.basic;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        amount = Math.abs(amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        amount = Math.abs(amount);
        if (balance - amount < 0) {
            throw new IllegalStateException("Not enough balance to continue the transaction");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
