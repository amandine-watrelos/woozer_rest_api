package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class GroupUser {

    @EmbeddedId
    private GroupUserId id;

    @ManyToOne
    @MapsId("groupId")
    private Group group;

    @ManyToOne
    @MapsId("userId")
    private User user;

    private String role;


    public GroupUser() {
    }


    public GroupUser(Group group, User user, String role) {
        this.group = group;
        this.user = user;
        this.id = new GroupUserId(group.getId(), user.getId());
        this.role = role;
    }


    public GroupUserId getId() {
        return id;
    }


    public void setId(GroupUserId id) {
        this.id = id;
    }


    public Group getGroup() {
        return group;
    }


    public void setGroup(Group group) {
        this.group = group;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof GroupUser))
            return false;
        GroupUser groupUser = (GroupUser) o;
        return Objects.equals(id, groupUser.id) &&
                Objects.equals(group, groupUser.group) &&
                Objects.equals(user, groupUser.user) &&
                Objects.equals(role, groupUser.role);
    }


    @Override public int hashCode() {
        return Objects.hash(id, group, user, role);
    }
}
