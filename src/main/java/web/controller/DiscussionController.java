package web.controller;

import entity.Discussion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DiscussionService;
import web.dto.DiscussionWithLastMessageDto;

import java.util.List;

@RestController
@RequestMapping(path = "/discussion")
@Slf4j
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @GetMapping(path = "/{discussionId}")
    public Discussion getDiscussionById(@PathVariable Long discussionId) {
        log.info("Récupération de la discussion d'id {}", discussionId);
        return discussionService.findById(discussionId);
    }

    @GetMapping(path = "list/{userId}")
    public List<DiscussionWithLastMessageDto> getDiscussionsByUserId(@PathVariable Long userId) {
        log.info("Récupération des discussions avec leur dernier message du user d'id {}", userId);
        return discussionService.getDiscussionsByUserId(userId);
    }

}