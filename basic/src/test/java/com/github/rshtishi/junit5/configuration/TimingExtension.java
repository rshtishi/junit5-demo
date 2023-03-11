package com.github.rshtishi.junit5.configuration;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.Duration;
import java.time.Instant;

public class TimingExtension implements Extension, BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final String START_TIME = "start time";

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Instant startTime = getStore(extensionContext).remove(START_TIME, Instant.class);
        long duration = Duration.between(startTime, Instant.now()).toMillis();
        System.out.println(String.format("Execution time: %d ms", duration));
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        getStore(extensionContext).put(START_TIME, Instant.now());
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }
}
