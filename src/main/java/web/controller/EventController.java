package web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Event;
import lombok.extern.slf4j.Slf4j;
import service.EventService;

@RestController
@RequestMapping(path = "/event")
@Slf4j
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping(path="list/{groupId}")
	public List<Event> getByGroup(@PathVariable Long groupId){
		log.info("Récupération des events du groupe d'id {}", groupId);
		return eventService.findAllByGroupId(groupId);
	}

	@GetMapping(path="/{eventId}")
	public Event getById(@PathVariable Long eventId){
		log.info("Récupération de l'event d'id {}", eventId);
		return eventService.findById(eventId);
	}
	
	@GetMapping(path="/perso/{userId}")
	public List<Event> getByUser(@PathVariable Long userId){
		log.info("Récupération des events de l'user d'id {}", userId);
		return eventService.findAllByUserId(userId);
	}
	
	@PostMapping(path = "/create/{groupId}")
    public Event create(@RequestBody Event event, @PathVariable Long groupId) {
		Event result = eventService.save(event);
        log.info("Sauvegarde de l'event d'id {} pour le groupe d'id {}", result.getId(), groupId);
        eventService.saveEventToGroup(result.getId(), groupId);
        return result;
    }

}
