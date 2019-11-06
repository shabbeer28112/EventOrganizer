/**
 * 
 */
package com.srk.EventOrganizer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srk.EventOrganizer.entity.Event;
import com.srk.EventOrganizer.service.EventService;

/**
 * @author shaishab
 *
 */

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;
	
	/*
	 * Create an event
	 */
	@PostMapping
	public Event saveEvent(@RequestBody Event event) {
		return eventService.save(event);
	}
	
	@PutMapping("/update")
	public Event updateEvent(@RequestBody Event event) {
		return eventService.updateEvent(event);
	}
	
	/*
	 * Get all the events from the MongoDB
	 */
	@GetMapping("/all")
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	
	/*
	 * Get an event by specific eventId
	 */
	@GetMapping("/{eventId}")
	public Optional<Event> getEventById(@PathVariable(name = "eventId") String eventId) {
		return eventService.getEvent(eventId);
	}
	
	/*
	 * Delete an event by specific eventId
	 */
	@DeleteMapping("/{eventId}")
	public void deleteEvent(@PathVariable(name = "eventId") String eventId) {
		eventService.deleteEvent(eventId);
	}
}
