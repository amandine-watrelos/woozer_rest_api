package dao;

import entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByEmail(String email);

    List<User> findAllByUsernameContaining(String username);
}
