package org.mario.springboot.app.springboot_app_di_inter_aop.repositories;

import java.util.List;

import org.mario.springboot.app.springboot_app_di_inter_aop.models.Event;

public interface EventRepository {

	List<Event> getEvents();
	Event getEventById(Long id);
	
}
