package dao;

import entity.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MessageDao extends CrudRepository<Message, Long> {

    @Query(value = "INSERT INTO message (discussion_id, user_id, date, message) VALUES (:discussionId, :userId, :date, :content)", nativeQuery = true)
    Message mySave(@Param("content") String content, @Param("date") Date date, @Param("userId") Long userId, @Param("discussionId") Long discussionId);

}