package com.example.GoGoGo.controller;

import com.example.GoGoGo.entity.Task;
import com.example.GoGoGo.repository.TaskRepository;
import com.example.GoGoGo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {


    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public List<Task> getAllTasks() {
       return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getId(@PathVariable long id) {

        return taskRepository.findById(id).orElse(null);
    }

    //TOdo рассказать разницу про PathVariable и RequestParam
    @GetMapping("/name/")
    public Task getName(@RequestParam String name) {
       return taskRepository.findByName(name).get();
    }


    @PostMapping
    public Task save(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {

        taskRepository.deleteById(id);
    }


}
