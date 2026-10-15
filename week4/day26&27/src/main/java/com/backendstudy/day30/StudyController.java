package com.backendstudy.day30;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudyController {

    private final StudyService studyService;

    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    @GetMapping("/day30/study-title")
    public String getStudy() {
        return studyService.getStudyTitle();
    }
}