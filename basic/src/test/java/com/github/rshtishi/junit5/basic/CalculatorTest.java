package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void sumReturnedWhenTwoNumbersAreAdded() {
        assertEquals(10, calculator.add(5, 5));
    }
}