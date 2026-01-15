package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        User user1 = new User(1, "Juan");
        User user2 = new User(2, "Ana");

        userService.addUser(user1);
        userService.addUser(user2);

        System.out.println("Lista de usuarios:");
        userService.getAllUsers().forEach(user ->
                System.out.println(user.getId() + " - " + user.getName())
        );
    }
}
