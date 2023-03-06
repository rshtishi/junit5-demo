package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileCreatorTest {

    @Test
    @DisplayName("Create file in temp directory")
    void testCreateFile(@TempDir File tempDir) throws IOException {
        FileCreator fileCreator = new FileCreator(tempDir);
        File file = fileCreator.createFile("test.txt");
        Assertions.assertTrue(file.exists());
    }
}