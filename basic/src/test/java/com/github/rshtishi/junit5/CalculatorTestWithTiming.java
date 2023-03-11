package com.github.rshtishi.junit5;

import com.github.rshtishi.junit5.basic.Calculator;
import com.github.rshtishi.junit5.configuration.TimingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithTiming {

    private static final int A = 2;
    private static final int B = 3;

    @RegisterExtension
    static TimingExtension timingExtension = new TimingExtension();

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(A, B);
        assertEquals(A + B, result);
    }
}
