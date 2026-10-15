package com.backendstudy.day30;

import org.springframework.stereotype.Service;

@Service 
public class StudyService {
    private  final StudyRepository studyRepository;
    private  final StudyFormatter studyFormatter;

    public StudyService(StudyRepository studyRepository, StudyFormatter studyFormatter) {
        this.studyRepository = studyRepository;
        this.studyFormatter = studyFormatter;
    }

    public String getStudyTitle() {
        String title = studyRepository.findStudyTitle();
        return studyFormatter.format(title);
    }
}
