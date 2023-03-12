package com.github.rshtishi.junit5.basic;

import com.github.rshtishi.junit5.configuration.TestLoggerExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestWithLogger {

    @RegisterExtension
    public TestLoggerExtension testLoggerExtension = new TestLoggerExtension();

    @Test
    public void testAdd() {
        //setup
        Calculator calculator = new Calculator();
        //execute
        int result = calculator.add(1,4);
        //verify
        testLoggerExtension.log("Result: "+result);
        assertEquals(5,result);
    }
}
