package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FactorialTest {

    @Test
    @Order(1)
    void whenNumIs1_then_computeWillReturn1() {
        //setup
        Factorial factorial = new Factorial();
        //execute
        int result = factorial.compute(1);
        //verify
        assertEquals(1, result);
    }

    @Test
    @Order(2)
    void whenNumis3_then_computeWillReturn3() {
        //setup
        Factorial factorial = new Factorial();
        //execute
        int result = factorial.compute(3);
        //verify
        assertEquals(6, result);
    }


}