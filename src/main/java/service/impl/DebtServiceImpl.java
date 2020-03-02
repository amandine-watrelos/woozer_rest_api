package service.impl;

import dao.DebtDao;
import entity.Debt;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DebtService;
import service.GroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtDao debtDao;

    @Autowired
    private GroupService groupService;

    @Override
    public List<Debt> findAllInGroup(Long groupId) {
        Set<User> usersInGroup = groupService.findById(groupId).getUsers();
        return debtDao.findAllByPayedForInOrPayedByIn(usersInGroup, usersInGroup);
    }

}
