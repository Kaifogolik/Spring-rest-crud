package com.example.GoGoGo.repository;


import com.example.GoGoGo.entity.Event;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends ListCrudRepository<Event, Long> {

    Optional<Event> findByName(String name);

}
