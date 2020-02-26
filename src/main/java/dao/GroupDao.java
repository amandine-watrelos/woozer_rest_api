package dao;

import entity.Group;
import entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao extends CrudRepository<Group, Long> {

   List<Group> findAllByUsersIn(List<User> users);

}
