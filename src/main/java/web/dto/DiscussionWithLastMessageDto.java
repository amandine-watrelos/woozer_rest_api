package web.dto;

import entity.Group;
import entity.Message;

public class DiscussionWithLastMessageDto {

    private Long id;

    private Group group;

    private Message message;

    public DiscussionWithLastMessageDto(Long id, Group group, Message message) {
        this.id = id;
        this.group = group;
        this.message = message;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
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
