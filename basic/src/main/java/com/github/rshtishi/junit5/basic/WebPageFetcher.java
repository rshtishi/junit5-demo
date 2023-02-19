package com.github.rshtishi.junit5.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

public class WebPageFetcher {

    public int fetchPage(URI uri) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) uri.toURL().openConnection();
            connection.setRequestMethod("GET");
            return connection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
