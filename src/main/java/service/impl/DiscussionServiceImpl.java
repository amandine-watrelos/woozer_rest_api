package service.impl;

import dao.DiscussionDao;
import dao.GroupDao;
import dao.MessageDao;
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
    private MessageDao messageDao;

    @Override
    public List<DiscussionWithLastMessageDto> getDiscussionsByUserId(Long userId) {
        List<DiscussionWithLastMessageDto> discussions = new ArrayList<>();
        List<Group> userGroups = groupService.findAllByUser(userId);
        Message lastMessage = null;
        for(Group group : userGroups) {
            lastMessage = messageDao.getLastMessageByDiscussionId(group.getId());
            discussions.add(new DiscussionWithLastMessageDto(group, lastMessage));
        }
        return discussions;
    }

}
