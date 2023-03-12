package com.github.rshtishi.junit5.basic;

import com.github.rshtishi.junit5.configuration.TimingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithTiming {

    private static final int A = 4;
    private static final int B = 2;

    @RegisterExtension
    static TimingExtension timingExtension = new TimingExtension();

    @Test
    void testAdd() {
        //setup
        Calculator calculator = new Calculator();
        //execute
        int result = calculator.add(A, B);
        //verify
        assertEquals(A + B, result);
    }

    @Test
    void testDivide(){
        //setup
        Calculator calculator = new Calculator();
        //execute
        int result = calculator.divide(A,B);
        //verify
        assertEquals(A/B, result);
    }
}
