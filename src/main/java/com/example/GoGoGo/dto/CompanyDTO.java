package com.example.GoGoGo.dto;

import java.util.List;

public class CompanyDTO implements DTO {
    List<EventDto> event;
    Long id;
    String name;
    String address;

    public List<EventDto> getEvent() {
        return event;
    }

    public void setEvent(List<EventDto> event) {
        this.event = event;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
