package service.impl;

import dao.DiscussionDao;
import dao.MessageDao;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DiscussionService;
import service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Autowired
    private DiscussionService discussionService;

    @Override
    public Message save(Message message, Long discussionId) {
        message.setDiscussion(discussionService.findById(discussionId));
        return messageDao.save(message);
    }
}
