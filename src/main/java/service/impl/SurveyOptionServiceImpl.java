package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SurveyOptionDao;
import entity.SurveyOption;
import service.SurveyOptionService;

@Service
public class SurveyOptionServiceImpl implements SurveyOptionService {
	
	@Autowired
	private SurveyOptionDao surveyOptionDao;

	@Override
	public SurveyOption voter(SurveyOption surveyOption) {
		return surveyOptionDao.save(surveyOption);
	}

}
