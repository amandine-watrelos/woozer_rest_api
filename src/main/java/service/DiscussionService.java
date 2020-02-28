package service;

import entity.Discussion;
import web.dto.DiscussionWithLastMessageDto;

import java.util.List;

public interface DiscussionService {

    Discussion findById(Long discussionId);

    List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId);
}
