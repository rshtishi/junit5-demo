package com.github.rshtishi.junit5.basic;

import com.github.rshtishi.junit5.configuration.LoggingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(LoggingExtension.class)
class CalculatorTestWithLogging {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        //setup
        int num1 = 1, num2 = 3;
        //execute
        int result = calculator.add(num1, num2);
        //verify
        int expected = 4;
        assertEquals(expected,result);
    }
}
