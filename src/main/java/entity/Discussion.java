package entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Discussion {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discussion")
    private List<Message> messages;

}
