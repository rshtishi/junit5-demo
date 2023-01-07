package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumReturnedWhenTwoNumbersAreAdded() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Disabled("Multiplication is not yet implemented")
    @Test
    void productReturnedWhenTwoNumbersAreMultiplied() {
        assertEquals(10, calculator.multiply(2, 5));
    }

}