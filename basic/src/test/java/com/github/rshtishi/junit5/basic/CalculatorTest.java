package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @EnabledIfSystemProperty(named = "type", matches = "unit")
    void quotientReturnWhenTwoNumberAreDivided() {
        assertEquals(10, calculator.divide(50, 5));
    }

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void quotientReturnWhenTwoNumberAreDividedNotOnCiServer() {
        assertEquals(100, calculator.divide(500, 5));
    }

    @Test
    void throwExceptionWhenDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }

}