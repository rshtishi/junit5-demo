package com.github.rshtishi.junit5.basic;

public class StringUtil {

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
