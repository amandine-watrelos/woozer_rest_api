package service.impl;

import dao.GroupDao;
import dao.UserDao;
import entity.Group;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GroupService;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Autowired
    private UserDao userDao;

    @Override
    public List<Group> findAllByUser(Long userId) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(userDao.findById(userId).get());
        return groupDao.findAllByUsersIn(userList);
    }

    @Override
    public Group findById(Long groupId) {
        return groupDao.findById(groupId).get();
    }
}
