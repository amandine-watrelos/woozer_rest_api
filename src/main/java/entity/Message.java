package entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "discussion_id")
    @JsonIgnore
    private Discussion discussion;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date date;

    private String message;

}
