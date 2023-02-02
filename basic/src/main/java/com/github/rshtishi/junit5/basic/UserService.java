package com.github.rshtishi.junit5.basic;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static class User {

        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
    }

    public boolean registerUser(User user){
        if(user==null){
            throw new IllegalArgumentException("User cannot be null");
        }
        userList.add(user);
        return true;
    }
}
