package com.example.GoGoGo.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Event {

    @Id
    Long id;
    String name;
    String description;

    @ManyToMany
    public List<Company> company;

    @OneToMany(mappedBy = "event")
    List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
