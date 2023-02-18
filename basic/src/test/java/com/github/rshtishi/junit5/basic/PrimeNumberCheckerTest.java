package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    private PrimeNumberChecker primeNumberChecker;

    @BeforeEach
    public void setUp() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    @TestFactory
    public Collection<DynamicTest> isPrime() {
        return Arrays.asList(
                DynamicTest.dynamicTest("1 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(1))),
                DynamicTest.dynamicTest("2 is a prime number", () -> assertTrue(primeNumberChecker.isPrime(2))),
                DynamicTest.dynamicTest("3 is a prime number", () -> assertTrue(primeNumberChecker.isPrime(3))),
                DynamicTest.dynamicTest("4 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(4))),
                DynamicTest.dynamicTest("5 is a prime number", () -> assertTrue(primeNumberChecker.isPrime(5))),
                DynamicTest.dynamicTest("6 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(6))),
                DynamicTest.dynamicTest("7 is a prime number", () -> assertTrue(primeNumberChecker.isPrime(7))),
                DynamicTest.dynamicTest("8 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(8))),
                DynamicTest.dynamicTest("9 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(9))),
                DynamicTest.dynamicTest("10 is not a prime number", () -> assertFalse(primeNumberChecker.isPrime(10))),
                DynamicTest.dynamicTest("11 is a prime number", () -> assertTrue(primeNumberChecker.isPrime(11)))
        );
    }
}