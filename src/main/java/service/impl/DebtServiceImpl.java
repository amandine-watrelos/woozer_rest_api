package service.impl;

import dao.DebtDao;
import entity.Debt;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DebtService;
import service.GroupService;
import service.UserService;

import java.util.*;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtDao debtDao;

    @Autowired
    private GroupService groupService;

    @Autowired
    private UserService userService;

    @Override
    public List<Debt> findAllInGroup(Long groupId) {
        Set<User> usersInGroup = groupService.findById(groupId).getUsers();
        return debtDao.findAllByPayedForInOrPayedByIn(usersInGroup, usersInGroup);
    }

    @Override
    public List<Debt> findAllByUser(Long userId) {
        Set<User> user = new HashSet<>(Arrays.asList(userService.findById(userId)));
        return debtDao.findAllByPayedForInOrPayedByIn(user, user);
    }


    @Override public Debt save(Debt debt) {
        return debtDao.save(debt);
    }
}
