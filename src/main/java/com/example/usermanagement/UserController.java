package com.example.usermanagement;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}


