package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String email;

}
