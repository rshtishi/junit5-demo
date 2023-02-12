package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CelsiusToFahrenheitArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(0.0, 32.0),
                Arguments.of(100.0, 212.0),
                Arguments.of(-40.0, -40.0),
                Arguments.of(37.0, 98.6)
        );
    }
}
