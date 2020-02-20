package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
