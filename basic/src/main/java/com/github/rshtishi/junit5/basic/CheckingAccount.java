package com.github.rshtishi.junit5.basic;

import java.util.concurrent.locks.ReentrantLock;

public class CheckingAccount {
    private final ReentrantLock lock = new ReentrantLock();
    private double balance;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            double newBalance = balance + amount;
            Thread.sleep(10); // simulate some processing time
            balance = newBalance;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            double newBalance = balance - amount;
            Thread.sleep(10); // simulate some processing time
            balance = newBalance;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}

