package com.example.GoGoGo.mapper;

import com.example.GoGoGo.dto.TaskDto;
import com.example.GoGoGo.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskToDtoMapper implements Mapper<TaskDto, Task> {
    @Override
    public TaskDto toDto(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        return taskDto;
    }
    @Override
    public Task toEntity(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        return task;
    }
}
