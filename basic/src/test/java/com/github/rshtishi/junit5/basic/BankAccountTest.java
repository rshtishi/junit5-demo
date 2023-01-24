package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Nested
    class WhenNew {

        private BankAccount account;

        @BeforeEach
        void setUp() {
            account = new BankAccount();
        }

        @Test
        void shouldHaveZeroBalance() {
            assertEquals(0, account.getBalance());
        }

        @Test
        void shouldThrowExceptionWhenWithdrawing() {
            assertThrows(IllegalStateException.class, () -> account.withdraw(100));
        }
    }

    @Nested
    class WhenDeposited100 {

        private BankAccount account;

        @BeforeEach
        void setUp() {
            account = new BankAccount();
            account.deposit(100);
        }

        @Test
        void shouldHaveBalance100() {
            assertEquals(100, account.getBalance());
        }

        @Test
        void shouldThrowExceptionWhenWithdrawing150() {
            assertThrows(IllegalStateException.class, () -> account.withdraw(150));
        }

        @Test
        void shouldLeave50AfterWithdrawing50() {
            account.withdraw(50);
            assertEquals(50, account.getBalance());
        }
    }
}