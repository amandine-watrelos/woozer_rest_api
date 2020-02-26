package dao;

import entity.Discussion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionDao extends CrudRepository<Discussion, Long> {

}