package dao;

import entity.Group;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao extends CrudRepository<Group, Long> {

   @Query(value = "SELECT * FROM woozer.group WHERE id in (SELECT group_id FROM group_user WHERE user_id = :userId)", nativeQuery = true)
   List<Group> findAllByUserId(@Param("userId") Long userId);

   @Query(value = "SELECT * FROM woozer.group WHERE id = :id", nativeQuery = true)
   Group findByGroupId(@Param("id") Long id);


}
