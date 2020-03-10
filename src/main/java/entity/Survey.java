package entity;

import lombok.Data;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table
@Data
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @JoinColumn(name = "type_survey")
    private String typeSurvey;
    
    private String title;
   
   @ManyToMany(cascade=CascadeType.ALL)
   @JoinTable(name = "survey_survey_option",
   joinColumns = {@JoinColumn(name = "survey_id")},
   inverseJoinColumns = {@JoinColumn(name = "option_id")})
   private Set<SurveyOption> options;
   
   @ManyToMany
   @JoinTable(name = "survey_user_answered",
           joinColumns = {@JoinColumn(name = "survey_id")},
           inverseJoinColumns = {@JoinColumn(name = "user_id")})
   private Set<User> answered;
    

    
}