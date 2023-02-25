package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class ExternalApiServiceTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testMakeApiCall() throws IOException {
        //setup
        ExternalApiService apiService = new ExternalApiService("https://example.com");
        //execute
        String response = apiService.makeApiCall();
        //verify
        assertNotNull(response);
    }

    @RepeatedTest(value = 15, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void repeatTestMakeApiCall() throws IOException {
        //setup
        ExternalApiService apiService = new ExternalApiService("https://example.com");
        //execute
        String response = apiService.makeApiCall();
        //verify
        assertNotNull(response);
    }

    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    @ParameterizedTest
    @ValueSource(strings = {"https://example.com", "https://example.net"})
    public void testMakeApiApiCallWithMultipleParameters(String input) throws IOException {
        //setup
        ExternalApiService apiService = new ExternalApiService(input);
        //execute
        String response = apiService.makeApiCall();
        //verify
        assertNotNull(response);
    }

    @TestFactory
    public List<DynamicTest> testMakeApiCallWithDynamicTestCases() {
        return Arrays.asList(
                dynamicTest("input: example.com", URI.create("https://example.com"), () -> {

                            assertTimeout(Duration.ofSeconds(5), () -> {
                                //setup
                                ExternalApiService apiService = new ExternalApiService("https://example.com");
                                //execute
                                String response = apiService.makeApiCall();
                                //verify
                                assertNotNull(response);
                            });
                        }
                )
        );
    }

}