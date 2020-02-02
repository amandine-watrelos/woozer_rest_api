package dao;

import entity.GroupUser;
import entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupUserDao extends CrudRepository<GroupUser, Long> {

    List<GroupUser> findAllByUser(User user);

}