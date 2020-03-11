package web.controller;

import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}")
        public User getById(@PathVariable long id) {
            log.info("Récupération du user d'id {}", id);
            return userService.findById(id);
        }

    @PostMapping(path = "/email")
        public User getByMail(@RequestBody String email) {
        log.info("Recherche du user par mail : {}", email);
        return userService.findByEmail(email);
    }

    @PostMapping(path = "/save")
    public User save(@RequestBody User user) {
        log.info("Sauvegarde du user avec le mail : {}", user.getEmail());
        return userService.save(user);
    }

    @GetMapping(path = "/username/like/{term}")
    public List<User> searchByUsername(@PathVariable String term) {
        log.info("Recherche des users avec un username contenant le term : {}", term);
        return userService.searchByUsername(term);
    }

    @GetMapping(path = "/all")
    public List<User> getAllUsers() {
        log.info("Récupération de touds les utilisateurs");
        return userService.findAllUsers();
    }
}
