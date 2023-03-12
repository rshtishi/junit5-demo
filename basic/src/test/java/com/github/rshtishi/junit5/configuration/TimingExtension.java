package com.github.rshtishi.junit5.configuration;

import org.junit.jupiter.api.extension.*;

import java.time.Duration;
import java.time.Instant;

public class TimingExtension implements BeforeAllCallback, AfterAllCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final String START_TIME = "start time";

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Instant startTime = getStore(extensionContext).remove(START_TIME, Instant.class);
        long duration = Duration.between(startTime, Instant.now()).toMillis();
        System.out.println(String.format("Test method: %s, Execution time: %d ms", extensionContext.getDisplayName(), duration));
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        getStore(extensionContext).put(START_TIME, Instant.now());
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("Test run ended");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("Test run started");
    }
}
