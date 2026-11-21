package com.backendstudy.day39;

import com.backendstudy.day26.Day26Application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Day26Application.class)
class Day39TodoServiceTest {

    @Autowired
    private Day39TodoService service;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 테스트용 데이터를 DB에 생성
    private Long createTodo() {
        return jdbcTemplate.queryForObject(
            "INSERT INTO day37_todos (title, completed) " +
            "VALUES (?, ?) RETURNING id",
            Long.class,
            "JUnit Test",
            false
        );
    }

    @Test
    void updateTodoTest() {
        Long id = createTodo();

        try {
            service.updateTodo(id, "Updated Todo", true);

            String title = jdbcTemplate.queryForObject(
                "SELECT title FROM day37_todos WHERE id = ?",
                String.class,
                id
            );

            Boolean completed = jdbcTemplate.queryForObject(
                "SELECT completed FROM day37_todos WHERE id = ?",
                Boolean.class,
                id
            );

            assertEquals("Updated Todo", title);
            assertEquals(Boolean.TRUE, completed);

        } finally {
            jdbcTemplate.update(
                "DELETE FROM day37_todos WHERE id = ?", id
            );
        }
    }

    @Test
    void deleteTodoTest() {
        Long id = createTodo();

        try {
            service.deleteTodo(id);

            Integer count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM day37_todos WHERE id = ?",
                Integer.class,
                id
            );

            assertEquals(0, count);

        } finally {
            jdbcTemplate.update(
                "DELETE FROM day37_todos WHERE id = ?", id
            );
        }
    }
}