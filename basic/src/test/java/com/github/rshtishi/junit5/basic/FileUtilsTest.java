package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void when_file_exists_then_read_content_is_successful_on_jre8() {
        //setup
        FileUtils fileUtils = new FileUtils();
        String filename = "src/test/resources/test.txt";
        //execute
        String content = fileUtils.readContent(filename);
        //verify
        String expectedContent = "data";
        assertEquals(expectedContent, content);
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_9, max=JRE.JAVA_11)
    public void when_file_exists_then_read_content_is_successful_on_range_jre8_to_jre11() {
        //setup
        FileUtils fileUtils = new FileUtils();
        String filename = "src/test/resources/test.txt";
        //execute
        String content = fileUtils.readContent(filename);
        //verify
        String expectedContent = "data";
        assertEquals(expectedContent, content);
    }

    @Test
    @DisabledOnJre(JRE.JAVA_17)
    public void when_file_exists_then_read_content_is_successful_disabled_on_jre17() {
        //setup
        FileUtils fileUtils = new FileUtils();
        String filename = "src/test/resources/test.txt";
        //execute
        String content = fileUtils.readContent(filename);
        //verify
        String expectedContent = "data";
        assertEquals(expectedContent, content);
    }


}