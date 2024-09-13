package com.example.GoGoGo.mapper;

import com.example.GoGoGo.dto.EventDto;
import com.example.GoGoGo.entity.Event;
import org.springframework.stereotype.Component;

@Component
public class EventToDtoMapper implements Mapper<EventDto, Event> {
    @Override
    public EventDto toDto(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setId(event.getId());
        eventDto.setName(event.getName());
        return eventDto;
    }

    @Override
    public Event toEntity(EventDto eventDto) {
        Event event = new Event();
        event.setId(eventDto.getId());
        event.setName(eventDto.getName());
        return event;
    }
}
