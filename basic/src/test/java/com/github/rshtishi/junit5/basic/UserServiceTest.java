package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("UserService Test")
class UserServiceTest {

    UserService userService;

    UserServiceTest(TestInfo info){
        System.out.println(info.getDisplayName());
    }

    @BeforeEach
    void setup(TestInfo info) {
       System.out.println(info.getDisplayName());
       userService = new UserService();
    }

    @DisplayName("when user is not null then user is added")
    @Test
    void userIsAddedWhenInputIsCorrect(TestInfo info){
        //setup
        System.out.println(info.getDisplayName());
        UserService.User user = new UserService.User();
        //execute
        boolean result = userService.registerUser(user);
        //verify
        assertEquals(true,result);
    }

}