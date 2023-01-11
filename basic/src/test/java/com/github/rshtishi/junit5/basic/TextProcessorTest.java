package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "TEXT_PROCESSING_ENABLED", matches = "true")
    void whenTextProvidedThenCountWordWillReturnWordCount() {
        //setup
        String text = "Hello Word!";
        TextProcessor textProcessor = new TextProcessor();
        //execute
        long wordCount = textProcessor.countWords(text);
        //verify
        assertEquals(2, wordCount);
    }

}