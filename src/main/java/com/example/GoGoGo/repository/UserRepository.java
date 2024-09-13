package com.example.GoGoGo.repository;

import com.example.GoGoGo.entity.TUser;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<TUser, Long> {

    Optional<TUser> findByName(String name);
    Optional<TUser> findById(long id);
}
