package dao;

import entity.Discussion;
import entity.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussionDao extends CrudRepository<Discussion, Long> {

    List<Discussion> findAllByGroupIn(List<Group> group);
}