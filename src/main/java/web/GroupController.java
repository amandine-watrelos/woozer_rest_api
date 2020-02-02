package web;

import entity.Group;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.GroupService;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/group")
@Slf4j
public class GroupController {

    @Autowired
    private GroupService groupService;

    @Autowired
    private UserService userService;

    @GetMapping(path = "/list")
    public List<Group> getByUser() {
        log.info("Récupération des groupes du user d'id {}", 1);
        return groupService.findAllByUser(userService.findById(1));
    }

}
