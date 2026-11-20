package com.backendstudy.day30;

import org.springframework.stereotype.Repository;

@Repository 
public class StudyRepository {
    public String findStudyTitle() {
        return "Spring Boot Study";
    }
}
