package web.controller;

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

    @PostMapping(path = "/save/{discussionId}")
    public Message save(@PathVariable Long discussionId, @RequestBody Message message) {
        log.info("Sauvegarde d'un message dans la discussion d'id {}", discussionId);
        return messageService.save(message, discussionId);
    }

}