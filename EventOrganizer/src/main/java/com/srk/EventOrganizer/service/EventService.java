/**
 * 
 */
package com.srk.EventOrganizer.service;

import java.util.List;
import java.util.Optional;

import com.srk.EventOrganizer.entity.Event;

/**
 * @author shaishab
 *
 */
public interface EventService {

	public Event save(Event event);

	public Event updateEvent(Event event);

	public List<Event> getAllEvents();

	public void deleteEvent(String eventId);

	public Optional<Event> getEvent(String eventId);

}
