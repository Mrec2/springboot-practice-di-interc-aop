package org.mario.springboot.app.springboot_app_di_inter_aop.services;

import java.util.List;

import org.mario.springboot.app.springboot_app_di_inter_aop.models.Event;
import org.mario.springboot.app.springboot_app_di_inter_aop.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class EventsServiceImpl implements EventsService{

	@Autowired
	@Qualifier("events")
	EventRepository eventRepository;
	
	@Override
	public List<Event> getEvents() {
		
		return eventRepository.getEvents();
	}

	@Override
	public Event getEventById(Long id) {
		
		return null;
	}

}
