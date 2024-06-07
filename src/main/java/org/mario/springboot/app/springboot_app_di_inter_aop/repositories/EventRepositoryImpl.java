package org.mario.springboot.app.springboot_app_di_inter_aop.repositories;

import java.util.List;

import org.mario.springboot.app.springboot_app_di_inter_aop.models.Event;



public class EventRepositoryImpl implements EventRepository{

	List<Event> events;
	
	public EventRepositoryImpl (List<Event> events) {
		this.events = events;
	}
	
	@Override
	public List<Event> getEvents() {
		
		return events;
	}

	@Override
	public Event getEventById(Long id) {
		
		return events.stream().filter(e->e.getId().equals(id)).findFirst().orElseThrow();
	}

}
