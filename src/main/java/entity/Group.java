package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Group {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<GroupUser> groupUsers;

    //private String photo:


    public Group() {
    }


    public Group(String name) {
        this.name = name;
        this.groupUsers = new ArrayList<>();
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<GroupUser> getGroupUsers() {
        return groupUsers;
    }


    public void setGroupUsers(List<GroupUser> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public void addTagUser(User user, String role) {
        GroupUser groupUser = new GroupUser(this, user, role);
        groupUsers.add(groupUser);
        user.getGroupUsers().add(groupUser);
    }

    public void removeTag(User user) {
        for (Iterator<GroupUser> iterator = groupUsers.iterator();
             iterator.hasNext(); ) {
            GroupUser groupUser = iterator.next();

            if (groupUser.getGroup().equals(this) && groupUser.getUser().equals(user)) {
                iterator.remove();
                groupUser.getUser().getGroupUsers().remove(groupUser);
                groupUser.setGroup(null);
                groupUser.setUser(null);
            }
        }
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Group))
            return false;
        Group group = (Group) o;
        return id == group.id &&
                Objects.equals(name, group.name) &&
                Objects.equals(groupUsers, group.groupUsers);
    }


    @Override public int hashCode() {
        return Objects.hash(id, name, groupUsers);
    }

}
