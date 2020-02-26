package entity;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "discussion_id")
    private Discussion discussion;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date date;

    private String message;

}
