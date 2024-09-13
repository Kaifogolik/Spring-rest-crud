package com.example.GoGoGo.dto;

import com.example.GoGoGo.entity.Task;

import java.util.List;

public class TUserDto implements DTO {
    long id;
    String name;
    List<Task> tasks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
