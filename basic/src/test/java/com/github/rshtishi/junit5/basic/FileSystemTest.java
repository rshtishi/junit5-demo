package com.github.rshtishi.junit5.basic;

import com.github.rshtishi.junit5.configuration.TestOnWindows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {

    @Test
    @EnabledOnOs(OS.LINUX)
    void whenOSisLinuxThenGetOperatingSystemWillReturnLinux() {
        //setup
        FileSystem fileSystem = new FileSystem();
        //execute
        String osName = fileSystem.getOperatingSystemName();
        //verify
        assertEquals("Linux", osName);
    }

    @TestOnWindows
    void whenOSisWindowsThenGetOperatingSystemWillReturnWindows() {
        //setup
        FileSystem fileSystem = new FileSystem();
        //execute
        String osName = fileSystem.getOperatingSystemName();
        //verify
        assertEquals("windows", osName);
    }


}