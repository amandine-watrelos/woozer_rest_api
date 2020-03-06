package entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="survey_option")
@Data
public class SurveyOption {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
    @JoinColumn(name = "nb_votes")
	private int nbVotes;
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "survey_option_user",
            joinColumns = {@JoinColumn(name = "survey_option_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> votes;
	
	
}
