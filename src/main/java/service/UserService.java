package service;

import entity.User;

import java.util.List;

public interface UserService {

    User findById(long id);

    User findByEmail(String email);

    void create(User user);

    List<User> searchByUsername(String term);

    List<User> findAllUsers();
}
