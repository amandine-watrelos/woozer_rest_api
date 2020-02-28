package service.impl;

import dao.DiscussionDao;
import entity.Discussion;
import entity.Group;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DiscussionService;
import service.GroupService;
import web.dto.DiscussionWithLastMessageDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscussionServiceImpl implements DiscussionService {

    @Autowired
    private GroupService groupService;

    @Autowired
    private DiscussionDao discussionDao;


    @Override public Discussion findById(Long discussionId) {
        return discussionDao.findById(discussionId).get();
    }

    @Override
    public List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId) {
        List<Group> groups = groupService.findAllByUser(userId);
        List<Discussion> discussions = discussionDao.findAllByGroupIn(groups);
        List<DiscussionWithLastMessageDto> discussionsWithLastMessage = new ArrayList<>();
        Message lastMessage;
        for(Discussion discussion : discussions) {
            lastMessage = null;
            if (!discussion.getMessages().isEmpty()) {
                lastMessage = discussion.getMessages().get(discussion.getMessages().size() - 1);
            }
            discussionsWithLastMessage.add(new DiscussionWithLastMessageDto(discussion.getId(), discussion.getGroup(), lastMessage));
        }
        return discussionsWithLastMessage;
    }

}
