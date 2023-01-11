package com.github.rshtishi.junit5.basic;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        /**
         * TO DO
         * implement the multiply operation
         */
        return 1;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Argument cannot be 0");
        }
        return num1 / num2;
    }
}
