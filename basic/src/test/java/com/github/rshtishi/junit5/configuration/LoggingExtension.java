package com.github.rshtishi.junit5.configuration;

import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.api.*;
import java.util.logging.*;

public class LoggingExtension implements  BeforeEachCallback, AfterEachCallback {
    private static final Logger logger = Logger.getLogger(LoggingExtension.class.getName());


    @Override
    public void beforeEach(ExtensionContext context) {
        logger.info("Starting test method: " + context.getDisplayName());
    }

    @Override
    public void afterEach(ExtensionContext context) {
        logger.info("Finishing test method: " + context.getDisplayName());
    }
}

