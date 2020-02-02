package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Group {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    //private String photo:
}
