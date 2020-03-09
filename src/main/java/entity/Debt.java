package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "payed_by_id")
    private User payedBy;

    @ManyToOne
    @JoinColumn(name = "payed_for_id")
    private User payedFor;

    private Double amount;

    private String comment;

    private boolean done;

}