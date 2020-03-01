package service.impl;

import dao.DiscussionDao;
import dao.MessageDao;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Autowired
    private DiscussionDao discussionDao;

    @Override
    public Message save(Message message, Long discussionId) {
        message.setDiscussion(discussionDao.findById(discussionId).get());
        return messageDao.save(message);
    }
}
