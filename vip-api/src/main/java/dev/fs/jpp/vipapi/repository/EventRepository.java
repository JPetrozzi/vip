package dev.fs.jpp.vipapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fs.jpp.vipapi.entity.Event;

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Serializable>{

}