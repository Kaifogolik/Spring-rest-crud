package com.example.GoGoGo.service;


import com.example.GoGoGo.dto.TUserDto;
import com.example.GoGoGo.entity.TUser;
import com.example.GoGoGo.mapper.TUserToDtoMapper;
import com.example.GoGoGo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private TUserToDtoMapper tUserToDtoMapper;
    @Autowired
     UserRepository userRepository;
    private TUserToDtoMapper TUserToDtoMapper;

    public List<TUserDto> getAllUsers() {
        List<TUser> tUsers = userRepository.findAll();
        List<TUserDto> dtoList = tUsers.stream()
                .map(tUser -> tUserToDtoMapper.toDto(tUser))
                .collect(Collectors.toList());
        return dtoList;
    }

    public TUserDto getUserById(long id) {
        return TUserToDtoMapper.toDto(userRepository.findById(id).get());
    }

    public TUserDto getUserName (String name) {
        return TUserToDtoMapper.toDto(userRepository.findByName(name).get());
    }

    public TUserDto creatUser (TUserDto user) {
        return tUserToDtoMapper.toDto(userRepository.save(tUserToDtoMapper.toEntity(user)));
    }
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }


}
