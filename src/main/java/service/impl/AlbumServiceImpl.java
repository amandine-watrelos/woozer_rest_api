package service.impl;

import dao.AlbumDao;
import dao.DiscussionDao;
import entity.Album;
import entity.Discussion;
import entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AlbumService;
import service.GroupService;

import java.util.Arrays;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Autowired
    private GroupService groupService;

    @Autowired
    private DiscussionDao discussionDao;

    @Override
    public List<Album> findAllInGroup(Long groupId) {
        List<Group> group = Arrays.asList(groupService.findById(groupId));
        return albumDao.findAllByGroupIn(group);
    }

    @Override public List<Album> findAllByUser(Long userId) {
        List<Group> groups = groupService.findAllByUser(userId);
        return albumDao.findAllByGroupIn(groups);
    }

}