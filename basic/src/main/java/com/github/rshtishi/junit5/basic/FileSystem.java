package com.github.rshtishi.junit5.basic;

public class FileSystem {

    public String getOperatingSystemName() {
        String osName = System.getProperty("os.name");
        return osName;
    }

}
