package com.example.GoGoGo.controller;


import com.example.GoGoGo.entity.TUser;
import com.example.GoGoGo.repository.UserRepository;
import com.example.GoGoGo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<TUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public TUser getUserById(@PathVariable long id) {
        return userRepository.findById(id).get();
    }
    @PostMapping
    public TUser createUser(@RequestBody TUser user) {
        return userRepository.save(user);
    }

//    @GetMapping
//    public User getByName(@RequestParam String name) {
//        return userRepository.findByName(name).get();
//    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id) {
        userRepository.deleteById(id);
    }
}
