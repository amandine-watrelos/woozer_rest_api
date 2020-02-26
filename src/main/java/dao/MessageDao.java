package dao;

import entity.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao extends CrudRepository<Message, Long> {

    @Query(value = "SELECT * FROM `message` m WHERE m.discussion_id = (SELECT d.id FROM `discussion` d WHERE d.group_id = :groupId) ORDER BY m.date desc LIMIT 1;", nativeQuery = true)
    Message getLastMessageByDiscussionId(@Param("groupId") Long groupId);

}