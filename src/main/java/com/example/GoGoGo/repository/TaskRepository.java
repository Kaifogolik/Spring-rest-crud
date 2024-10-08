package com.example.GoGoGo.repository;


import com.example.GoGoGo.entity.Task;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends ListCrudRepository<Task, Long> {


    Optional<Task> findByName(String name);
    Optional<Task> findById(Long id);
}