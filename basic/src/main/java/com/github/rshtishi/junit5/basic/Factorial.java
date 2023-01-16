package com.github.rshtishi.junit5.basic;

public class Factorial {

    public int compute(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
