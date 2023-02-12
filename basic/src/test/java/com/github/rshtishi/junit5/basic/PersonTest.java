package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @ValueSource(strings = {"01.01.2017", "31.12.2017"})
    void testBirthday(@ConvertWith(LocalDateArgumentConverter.class) LocalDate birthday) {
        Person person = new Person("John Doe", birthday);
        assertEquals(2017, person.getBirthday().getYear());
    }

}