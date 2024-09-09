package com.example.GoGoGo.controller;


import com.example.GoGoGo.entity.User;
import com.example.GoGoGo.repository.UserRepository;
import com.example.GoGoGo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping
    public User getUserById(@RequestParam long id) {
        return userRepository.findById(id).get();
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public User getByName(@RequestParam String name) {
        return userRepository.findByName(name).get();
    }

    @DeleteMapping
    public void deleteUserById(@RequestParam long id) {
        userRepository.deleteById(id);
    }
}
