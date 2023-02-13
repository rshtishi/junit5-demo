package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCostCalculatorTest {

    private ShippingCostCalculator shippingCostCalculator;

    @BeforeEach
    public void setup() {
        shippingCostCalculator = new ShippingCostCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "book, 2, false, 20.0",
            "electronics, 3, true, 90.0",
            "book, 4, true, 60.0"
    })
    void testShippingCostCalculation(ArgumentsAccessor arguments) {
        double result = shippingCostCalculator.calculateShippingCost(arguments.getString(0), arguments.getInteger(1), arguments.getBoolean(2));
        assertEquals(arguments.getDouble(3), result);
    }

}