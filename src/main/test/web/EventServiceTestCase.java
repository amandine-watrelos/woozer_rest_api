package web;

import entity.Event;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.EventService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventServiceTestCase {

    @Autowired
    private EventService eventService;

    @Test
    public void shouldFindById() {
        // when
        Event eventFound = eventService.findById(1L);

        // then
        assert (eventFound.getName()).equals("Crémaillière Marie");
    }

    @Test
    public void shouldFindAllByUserId() {
        // when
        List<Event> eventsFound = eventService.findAllByUserId(1L);

        // then
        assert (eventsFound.size() == 2);
    }

    @Test
    public void shouldFindAllInGroup() {
        // when
        List<Event> eventsFound = eventService.findAllByGroupId(4L);

        // then
        assert (eventsFound.size() == 2);
    }

    @Test
    public void shouldSaveEvent() {
        // given
        Event event = new Event();
        event.setName("mon event");
        // when
        Event eventSaved = eventService.save(event);

        // then
        assert (eventSaved.getName()).equals("mon event");
    }

}