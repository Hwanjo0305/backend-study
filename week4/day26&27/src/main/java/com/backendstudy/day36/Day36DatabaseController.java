package com.backendstudy.day36;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Day36DatabaseController {
    private final JdbcTemplate jdbcTemplate;

    public Day36DatabaseController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/day36/db-check") 
    public String checkDatabase() {
        return jdbcTemplate.queryForObject(
            "SELECT current_database()",String.class);
    }
}
