package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "ana", "level", "radar"})
    void testIsPalindromePositive(String str) {
        assertTrue(StringUtil.isPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "bird", "hunter", "clock"})
    void testIsPalindromeNegative(String str) {
        assertFalse(StringUtil.isPalindrome(str));
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {" ", "   ", "\t", "\n"})
    void testIsBlankPositive(String str) {
        assertTrue(StringUtil.isBlank(str));
    }

    private static Stream<Arguments> palindromeInputs() {
        return Stream.of(
                Arguments.of("racecar", true),
                Arguments.of("hello", false),
                Arguments.of("level", true)
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeInputs")
    void testIsPalindromeWithExplicitLocalMethodSource(String input, boolean expected) {
        assertEquals(expected,StringUtil.isPalindrome(input));
    }

}