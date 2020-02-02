package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class GroupUser {

    @Id
    @GeneratedValue
    private long id;

    @JoinColumn(name = "group_id")
    private Group group;

    @JoinColumn(name = "user_id")
    private User user;

    private String role;

}
