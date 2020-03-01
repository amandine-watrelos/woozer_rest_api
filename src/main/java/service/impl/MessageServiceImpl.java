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

    @Override
    public Message save(Message message, Long discussionId) {
        return messageDao.mySave(message.getMessage(), message.getDate(), message.getUser().getId(), discussionId);
    }
}
