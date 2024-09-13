package com.example.GoGoGo.dto;

import com.example.GoGoGo.entity.Event;
import com.example.GoGoGo.entity.TUser;

import java.io.Serializable;

public class TaskDto implements DTO {
    private long id;
    private String name;
    Event event;
    TUser tUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
