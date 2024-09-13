package com.example.GoGoGo.controller;


import com.example.GoGoGo.dto.EventDto;
import com.example.GoGoGo.entity.Event;
import com.example.GoGoGo.service.EventService;
import com.example.GoGoGo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<EventDto> getEvents() {
        return eventService.getAllEvents();

    }

    @GetMapping("/{id}")
    public EventDto getById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    public EventDto addEvent(@RequestBody EventDto event) {
        return eventService.saveEvent(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable long id) {
        eventService.deleteEvent(id);
    }

    @PutMapping("/{id}")
    public EventDto updateEvent(@RequestBody EventDto event) {
        return eventService.updateEvent(event);
    }


}
