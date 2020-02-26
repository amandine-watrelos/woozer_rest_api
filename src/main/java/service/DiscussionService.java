package service;

import web.dto.DiscussionWithLastMessageDto;

import java.util.List;

public interface DiscussionService {


    List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId);
}
