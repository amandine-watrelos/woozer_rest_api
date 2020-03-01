package web.controller;

import entity.Discussion;
import entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DiscussionService;
import service.MessageService;

@RestController
@RequestMapping(path = "/message")
@Slf4j
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private DiscussionService discussionService;

    @PostMapping(path = "/save/{discussionId}")
    public Discussion save(@PathVariable Long discussionId, @RequestBody Message message) {
        log.info("Sauvegarde d'un message dans la discussion d'id {}", discussionId);
        return discussionService.save(message, discussionId);
    }

}