/**
 * 
 */
package com.srk.EventOrganizer.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.EventOrganizer.entity.Event;
import com.srk.EventOrganizer.repository.EventRepository;
import com.srk.EventOrganizer.service.EventService;

/**
 * @author shaishab
 *
 */
@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepo;
	
	@Override
	public Event save(Event event) {
		// TODO Auto-generated method stub
		return eventRepo.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepo.save(event);
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findAll();
	}

	@Override
	public void deleteEvent(String eventId) {
		// TODO Auto-generated method stub
		eventRepo.deleteById(eventId);
	}

	@Override
	public Optional<Event> getEvent(String eventId) {
		// TODO Auto-generated method stub
		return eventRepo.findById(eventId);
	}

}
