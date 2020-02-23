package dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Event;

@Repository
public interface EventDao extends CrudRepository<Event,Long> {
	
	@Query(value= "SELECT * FROM event WHERE id in (SELECT event_id FROM group_event WHERE group_id = :groupId)", nativeQuery = true)
	List<Event> findAllByGroupId(@Param("groupId") Long groupId);
}
