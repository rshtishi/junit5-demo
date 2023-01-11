package com.github.rshtishi.junit5.basic;

import java.util.stream.Stream;

public class TextProcessor {

    public long countWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }
}
