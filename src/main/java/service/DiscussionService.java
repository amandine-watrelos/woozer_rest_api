package service;

import entity.Discussion;
import entity.Message;
import web.dto.DiscussionWithLastMessageDto;

import java.util.List;

public interface DiscussionService {

    Discussion save(Message message, Long discussionId);

    Discussion findById(Long discussionId);

    List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId);
}
