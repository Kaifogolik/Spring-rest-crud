package com.example.GoGoGo.service;


import com.example.GoGoGo.dto.EventDto;
import com.example.GoGoGo.entity.Event;
import com.example.GoGoGo.mapper.EventToDtoMapper;
import com.example.GoGoGo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventToDtoMapper eventToDtoMapper;

    public List<EventDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();
        List<EventDto> dtoList = events.stream()
                .map(event -> eventToDtoMapper.toDto(event))
                .collect(Collectors.toList());
        return dtoList;

    }
    public EventDto getEventById(long id) {
        Event event = eventRepository.findById(id).get();
        EventDto dto = eventToDtoMapper.toDto(event);
        return dto;
    }
    public EventDto saveEvent(EventDto eventDto) {
       return eventToDtoMapper.toDto(eventRepository.save(eventToDtoMapper.toEntity(eventDto)));
    }
    public EventDto updateEvent(EventDto eventDto) {
        //1. Dto который мы получили надо трансформировать в Entity
        Event event = eventToDtoMapper.toEntity(eventDto);

        //2. Здесь вызов репозитория
        Event save = eventRepository.save(event);

        //3. после того как мы получили Энтити его надо снова трансформировать в DTO
        return eventToDtoMapper.toDto(save);
    }
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }
}
