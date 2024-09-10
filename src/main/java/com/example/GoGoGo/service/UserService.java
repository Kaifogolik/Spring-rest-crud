package com.example.GoGoGo.service;


import com.example.GoGoGo.entity.TUser;
import com.example.GoGoGo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<TUser> getAllUsers() {
        return userRepository.findAll();
    }


}
