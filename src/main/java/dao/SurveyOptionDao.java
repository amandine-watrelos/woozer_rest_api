package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.SurveyOption;

@Repository
public interface SurveyOptionDao extends CrudRepository<SurveyOption, Long> {
}
