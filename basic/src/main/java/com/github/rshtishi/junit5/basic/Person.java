package com.github.rshtishi.junit5.basic;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
