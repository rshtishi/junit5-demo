package com.github.rshtishi.junit5.configuration;

import org.junit.jupiter.api.extension.*;

import java.time.LocalDateTime;

public class TestLoggerExtension implements BeforeEachCallback, AfterEachCallback {


    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("Test method ended for: " + extensionContext.getDisplayName());
    }


    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("Test method started for: " + extensionContext.getDisplayName());
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }

}
