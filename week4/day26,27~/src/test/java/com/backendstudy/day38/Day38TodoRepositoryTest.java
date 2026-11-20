package com.backendstudy.day38;

import com.backendstudy.day26.Day26Application;
import com.backendstudy.day37.TodoEntity;

import jakarta.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Day26Application.class)
@Transactional
class Day38TodoRepositoryTest {

    @Autowired
    private Day38TodoRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Test
    void saveAndFindById() {

        // 1. 새로운 Todo 생성
        TodoEntity todo =
                new TodoEntity("Day38 JPA Test", false);

        // 2. PostgreSQL에 저장
        TodoEntity saved = repository.saveAndFlush(todo);

        Long savedId = saved.getId();

        assertNotNull(savedId);

        // 3. 영속성 컨텍스트 초기화
        entityManager.clear();

        // 4. DB에서 다시 조회
        TodoEntity found =
                repository.findById(savedId).orElseThrow();

        // 5. 저장된 값 검증
        assertEquals("Day38 JPA Test", found.getTitle());
        assertFalse(found.isCompleted());
    }

    @Test
    void findAllContainsSavedTodo() {

        TodoEntity todo =
                new TodoEntity("Day38 findAll Test", false);

        TodoEntity saved = repository.saveAndFlush(todo);

        Long savedId = saved.getId();

        entityManager.clear();

        boolean exists = repository.findAll()
                .stream()
                .anyMatch(t -> savedId.equals(t.getId()));

        assertTrue(exists);
    }
}