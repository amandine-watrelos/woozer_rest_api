package service.impl;

import dao.GroupDao;
import dao.GroupUserDao;
import entity.Group;
import entity.GroupUser;
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
    private GroupUserDao groupUserDao;

    @Override
    public List<Group> findAllByUser(User user) {

        List<GroupUser> groupUsers = groupUserDao.findAllByUser(user);
        List<Group> groups = new ArrayList<>();
        for(GroupUser groupUser : groupUsers) {
            groups.add(groupUser.getGroup());
        }
        return groups;
    }
}
