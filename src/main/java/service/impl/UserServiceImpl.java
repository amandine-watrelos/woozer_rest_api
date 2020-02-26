package service.impl;

import dao.UserDao;
import entity.User;
import exception.EmailAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User findById(long id) {
        return userDao.findById(id).get();
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public void create(User user) {
        User testIfMailExists = userDao.findByEmail(user.getEmail());
        if(testIfMailExists != null) {
            throw new EmailAlreadyExistsException(user.getEmail());
        }
        userDao.save(user);
    }

    @Override
    public List<User> searchByUsername(String term) {
        return userDao.findAllByUsernameContaining(term);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> res = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(res::add);
        return res;
    }
}
