package service;

import entity.Discussion;
import web.dto.DiscussionWithLastMessageDto;

import java.util.List;

public interface DiscussionService {

    Discussion save(Discussion discussion);

    Discussion findById(Long discussionId);

    List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId);
}
