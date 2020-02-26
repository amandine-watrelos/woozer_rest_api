package web.dto;

import entity.Group;
import entity.Message;

public class DiscussionWithLastMessageDto {

    private Group group;

    private Message message;

    public DiscussionWithLastMessageDto(Group group, Message message) {
        this.group = group;
        this.message = message;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
