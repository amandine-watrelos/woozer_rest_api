package dao;

import entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByEmail(String email);

    @Query(value = "SELECT * FROM woozer.user WHERE username LIKE %:username%", nativeQuery = true)
    List<User> findUsersByUsernameIsLike(@Param("username") String username);

}
