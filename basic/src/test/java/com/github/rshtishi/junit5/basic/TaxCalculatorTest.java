package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("tax")
class TaxCalculatorTest {

    @Test
    public void whenAmountIsMinimalWage_thenNoTaxIsApplied() {
        //setup
        TaxCalculator taxCalculator = new TaxCalculator();
        //execute
        double taxAmount = taxCalculator.calculate(30000);
        //verify
        assertEquals(0.0, taxAmount);
    }

}