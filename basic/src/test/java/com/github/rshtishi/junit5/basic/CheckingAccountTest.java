package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
class CheckingAccountTest {

    @Test
    public void testDeposit() throws InterruptedException {
        CheckingAccount account = new CheckingAccount(100.0);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> account.deposit(1.0));
            threads[i].start();
        }
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }

        assertEquals(200.0, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() throws InterruptedException {
        CheckingAccount account = new CheckingAccount(100.0);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> account.withdraw(1.0));
            threads[i].start();
        }
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }
        assertEquals(0.0, account.getBalance(), 0);
    }


}