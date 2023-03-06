package com.github.rshtishi.junit5.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {

    private File tempDir;

    public FileCreator(File tempDir) {
        this.tempDir = tempDir;
    }

    public File createFile(String fileName) throws IOException {
        Path filePath = tempDir.toPath().resolve(fileName);
        return Files.createFile(filePath).toFile();
    }
}

