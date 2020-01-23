package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "member")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String email;

}
