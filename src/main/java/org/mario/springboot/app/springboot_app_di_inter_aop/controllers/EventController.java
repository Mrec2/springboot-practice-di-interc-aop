package org.mario.springboot.app.springboot_app_di_inter_aop.controllers;

import org.mario.springboot.app.springboot_app_di_inter_aop.services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventController {

	@Autowired
	EventsService eventsService;
	
	@GetMapping("/events")
	public ResponseEntity<?> getEvents(){
		return ResponseEntity.ok(eventsService.getEvents());
	}
	
	@GetMapping("/event/{id}")
	public ResponseEntity<?> getEventById(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok(eventsService.getEventById(id));
	}
	
}
