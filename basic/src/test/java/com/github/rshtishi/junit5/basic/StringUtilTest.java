package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

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

}