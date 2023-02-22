package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

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

}