package com.example.demo3;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
    private List<User> users;

    public UserAuthentication() {
        users = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Successful login
            }
        }
        return false; // Login failed
    }

    public boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // User already exists
            }
        }
        users.add(new User(username, password));
        return true; // Registration successful
    }
}
