package entity;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

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

}
