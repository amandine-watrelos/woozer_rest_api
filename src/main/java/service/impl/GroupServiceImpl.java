package service.impl;

import dao.GroupDao;
import entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GroupService;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Override
    public List<Group> findAllByUserId(Long userId) {
        return groupDao.findAllByUserId(userId);
    }

    @Override
    public Group findById(Long groupId) {
        return groupDao.findById(groupId).orElse(null);
    }
}
