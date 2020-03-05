package service.impl;

import dao.GroupDao;
import entity.Discussion;
import entity.Group;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DiscussionService;
import service.GroupService;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussionService discussionService;

    @Override
    public List<Group> findAllByUser(Long userId) {
        List<User> userList = Arrays.asList(userService.findById(userId));
        return groupDao.findAllByUsersIn(userList);
    }

    @Override
    public Group findById(Long groupId) {
        return groupDao.findById(groupId).get();
    }

    @Override
    public Group save(Group group) {
        Group groupSaved = groupDao.save(group);
        // si on est dans le cas de la création d'un groupe, une discussion doit être créée et liée au groupe
        if (group.getId() != null) {
            Discussion discussionToCreate = new Discussion();
            discussionToCreate.setGroup(groupSaved);
            discussionService.save(discussionToCreate);
        }
        return groupSaved;
    }

}
