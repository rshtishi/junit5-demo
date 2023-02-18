package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @BeforeEach
    public void setup(TestInfo testInfo) {
        System.out.println("Start: " + testInfo.getDisplayName());
    }

    @AfterEach
    public void tearDown(TestInfo testInfo) {
        System.out.println("End: " + testInfo.getDisplayName());
    }

    @DisplayName("Test Area of Rectangle")
    @ParameterizedTest(name = "it: {index} width:{0} height:{1} => area:{2}")
    @CsvSource({
            "10,20,200",
            "5,15,75",
            "12,30,360"
    })
    void testArea(@AggregateWith(RectangleAggregator.class) Rectangle rectangle, ArgumentsAccessor argumentAccessor) {
        assertEquals(argumentAccessor.getInteger(2), rectangle.getArea());
    }

    static class RectangleAggregator implements ArgumentsAggregator {

        @Override
        public Rectangle aggregateArguments(ArgumentsAccessor argumentsAccessor, ParameterContext parameterContext) throws ArgumentsAggregationException {
            int width = argumentsAccessor.getInteger(0);
            int height = argumentsAccessor.getInteger(1);
            return new Rectangle(width, height);
        }
    }

}