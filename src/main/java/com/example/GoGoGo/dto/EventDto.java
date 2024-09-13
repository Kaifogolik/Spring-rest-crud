package com.example.GoGoGo.dto;

import com.example.GoGoGo.entity.Company;
import com.example.GoGoGo.entity.Task;

import java.io.Serializable;
import java.util.List;

public class EventDto implements DTO {
    Long id;
    String name;
    String description;
    List<Task> tasks;
    List<Company> company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }
}
