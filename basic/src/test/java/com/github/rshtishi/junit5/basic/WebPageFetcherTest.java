package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class WebPageFetcherTest {

    @TestFactory
    List<DynamicTest> testFetchWebPage() {
        return new TestGenerator().generateTests();
    }

    private static class TestGenerator {

        public List<DynamicTest> generateTests() {
            // Define an array of URIs to test with
            URI[] uris = new URI[]{
                    URI.create("http://example.com"),
                    URI.create("http://example.org"),
                    URI.create("http://example.net")
            };

            // Use a lambda expression to create a list of dynamic tests

            List<DynamicTest> tests = new ArrayList<>();
            for (URI uri : uris) {
                // Create a dynamic test with a display name and a URI
                DynamicTest test = dynamicTest("Test fetch with " + uri, uri, () -> {

                    int statusCode = new WebPageFetcher().fetchPage(uri);
                    assertEquals(200, statusCode, "Status code is not 200");
                });
                tests.add(test);
            }
            return tests;
            
        }
    }

}

