package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @ParameterizedTest
    @CsvSource({
            "The Great Gatsby, The Great Gatsby",
            "To Kill a Mockingbird, To Kill a Mockingbird",
            "Pride and Prejudice, Pride and Prejudice"
    })
    void testBookTitle(Book book, String expectedTitle) {
        assertEquals(expectedTitle, book.getTitle());
    }

}