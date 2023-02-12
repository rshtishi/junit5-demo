package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @ParameterizedTest
    @ArgumentsSource(CelsiusToFahrenheitArgumentProvider.class)
    void testCelsiusToFahrenheit(double celsius, double expected) {
        double actual = TemperatureConverter.celsiusToFahrenheit(celsius);
        assertEquals(expected, actual, 0.1);
    }

}