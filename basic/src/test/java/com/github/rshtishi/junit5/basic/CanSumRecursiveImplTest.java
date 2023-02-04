package com.github.rshtishi.junit5.basic;

import static org.junit.jupiter.api.Assertions.*;

class CanSumRecursiveImplTest implements CanSumTest {

    @Override
    public CanSum getCanSum() {
        return new CanSumRecursiveImpl();
    }
}