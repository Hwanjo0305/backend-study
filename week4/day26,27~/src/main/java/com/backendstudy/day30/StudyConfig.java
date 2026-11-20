package com.backendstudy.day30;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class StudyConfig {
    
    @Bean
    public StudyFormatter studyFormatter() {
        return new StudyFormatter();
    }
}
