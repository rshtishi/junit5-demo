package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateArgumentConverter extends SimpleArgumentConverter {

    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public Object convert(Object source, Class targetType) {
        if (targetType == LocalDate.class && source instanceof String) {
            return LocalDate.parse((String) source, formatter);
        }
        throw new IllegalArgumentException(
                "Cannot convert " + source + " to " + targetType);
    }


}
