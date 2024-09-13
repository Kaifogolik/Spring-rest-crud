package com.example.GoGoGo.controller;


import com.example.GoGoGo.dto.TUserDto;
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
    public List<TUserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public TUserDto getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }
    @PostMapping
    public TUserDto createUser(@RequestBody TUserDto user) {
        return userService.creatUser(user);
    }

    @GetMapping
    public TUserDto getByName(@RequestParam String name) {
        return userService.getUserName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUserById(id);
    }
}
