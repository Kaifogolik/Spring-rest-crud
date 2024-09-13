package com.example.GoGoGo.controller;

import com.example.GoGoGo.dto.TaskDto;
import com.example.GoGoGo.entity.Task;
import com.example.GoGoGo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {


    @Autowired
    private TaskService taskService;


    @GetMapping("/")
    public List<TaskDto> getAllTasks() {
       return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public TaskDto getId(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    //TOdo рассказать разницу про PathVariable и RequestParam
    @GetMapping("/name/")
    public TaskDto getName(@RequestParam String name) {
       return taskService.getTaskByName(name);
    }


    @PostMapping
    public TaskDto save(@RequestBody TaskDto task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
    }

}
