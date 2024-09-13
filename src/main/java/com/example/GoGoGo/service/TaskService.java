package com.example.GoGoGo.service;

import com.example.GoGoGo.dto.TaskDto;
import com.example.GoGoGo.entity.Task;
import com.example.GoGoGo.mapper.TaskToDtoMapper;
import com.example.GoGoGo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    private TaskToDtoMapper taskToDtoMapper;


    public List<TaskDto> getAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        List<TaskDto> dtoList = tasks.stream()
                .map(task -> taskToDtoMapper.toDto(task))
                .collect(Collectors.toList());
        return dtoList;
    }
    public TaskDto getTaskById(long id) {
        return taskToDtoMapper.toDto(taskRepository.findById(id).get());
    }
    public TaskDto createTask(TaskDto taskDto) {
        return taskToDtoMapper.toDto(taskRepository.save(taskToDtoMapper.toEntity(taskDto)));
    }
    public TaskDto updateTask(long id, TaskDto taskDto) {
        Task task = taskRepository.findById(id).get();
        task.setName(taskDto.getName());
        return taskToDtoMapper.toDto(taskRepository.save(task));
    }
    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }
    public TaskDto getTaskByName(String name) {
        return taskToDtoMapper.toDto(taskRepository.findByName(name).get());
    }
}
