package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String email;

}
