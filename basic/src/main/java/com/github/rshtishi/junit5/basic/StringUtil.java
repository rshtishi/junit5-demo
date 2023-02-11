package com.github.rshtishi.junit5.basic;

public class StringUtil {

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean isBlank(String str){
        if(str==null || str.trim().isEmpty()){
            return true;
        }
        return false;
    }
}
