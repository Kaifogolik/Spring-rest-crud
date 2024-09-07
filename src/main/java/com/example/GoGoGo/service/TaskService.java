package com.example.GoGoGo.service;

import com.example.GoGoGo.Task;
import com.example.GoGoGo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
