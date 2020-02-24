package web;

import entity.Group;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.GroupService;

import java.util.List;

@RestController
@RequestMapping(path = "/group")
@Slf4j
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping(path = "/list/{userId}")
    public List<Group> getByUser(@PathVariable Long userId) {
         log.info("Récupération des groupes du user d'id {}", userId);
        return groupService.findAllByUserId(userId);
    }

    @GetMapping(path = "/{id}")
    public Group getById(@PathVariable Long id) {
        log.info("Récupération du groupe d'id {}", id);
        return groupService.findById(id);
    }

    @PostMapping(path = "/save")
    public Group save(@RequestBody Group group) {
        log.info("Sauvegarde du groupe de nom {}", group.getName());
        return groupService.save(group);
    }

}
