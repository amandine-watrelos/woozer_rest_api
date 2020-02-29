package service;

import entity.Group;
import entity.User;

import java.util.List;

public interface GroupService {

    List<Group> findAllByUser(Long user);

    Group findById(Long groupId);

    Group save(Group group);
}
