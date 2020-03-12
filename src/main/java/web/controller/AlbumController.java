package web.controller;

import entity.Album;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AlbumService;

import java.util.List;

@RestController
@RequestMapping(path = "/album")
@Slf4j
public class AlbumController {

    @Autowired
    private AlbumService albumService;


    @GetMapping(path = "list/group/{groupId}")
    public List<Album> getByGroup(@PathVariable Long groupId) {
        log.info("Récupération des dettes du groupe d'id {}", groupId);
        return albumService.findAllInGroup(groupId);
    }


    @GetMapping(path = "list/user/{userId}")
    public List<Album> getByUser(@PathVariable Long userId) {
        log.info("Récupération des dettes du user d'id {}", userId);
        return albumService.findAllByUser(userId);
    }

}