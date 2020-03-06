package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.SurveyOption;
import lombok.extern.slf4j.Slf4j;
import service.SurveyOptionService;

@RestController
@RequestMapping(path = "/voter")
@Slf4j
public class SurveyOptionController {

    @Autowired
    private SurveyOptionService surveyOptionService;

    @PostMapping
    public SurveyOption voter(@RequestBody SurveyOption surveyOption) {
        log.info("Vote d'un utilisateur pour l'option {}", surveyOption.getId());
        return surveyOptionService.voter(surveyOption);
    }

}