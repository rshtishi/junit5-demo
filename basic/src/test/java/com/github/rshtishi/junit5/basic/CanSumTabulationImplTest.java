package com.github.rshtishi.junit5.basic;

import static org.junit.jupiter.api.Assertions.*;

class CanSumTabulationImplTest implements CanSumTest{

    @Override
    public CanSum getCanSum() {
        return new CanSumTabulationImpl();
    }
}