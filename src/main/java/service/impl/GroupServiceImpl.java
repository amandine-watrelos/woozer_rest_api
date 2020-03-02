package service.impl;

import dao.GroupDao;
import dao.UserDao;
import entity.Group;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        return groupDao.save(group);
    }

}
