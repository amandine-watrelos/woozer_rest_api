package service;

import entity.Message;

public interface MessageService {

    Message save(Message message, Long discussionId);
}
