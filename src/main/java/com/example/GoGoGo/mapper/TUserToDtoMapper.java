package com.example.GoGoGo.mapper;

import com.example.GoGoGo.dto.TUserDto;
import com.example.GoGoGo.entity.TUser;
import org.springframework.stereotype.Component;

@Component
public class TUserToDtoMapper implements Mapper<TUserDto, TUser> {
    @Override
    public TUserDto toDto(TUser tUser) {
        TUserDto tUserDto = new TUserDto();
        tUserDto.setId(tUser.getId());
        tUserDto.setName(tUser.getName());
        return tUserDto;
    }
    @Override
    public TUser toEntity(TUserDto tUserDto) {
        TUser tUser = new TUser();
        tUser.setId(tUserDto.getId());
        tUser.setName(tUserDto.getName());
        return tUser;
    }
}
