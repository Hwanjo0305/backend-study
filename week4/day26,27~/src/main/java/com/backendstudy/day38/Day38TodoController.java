package com.backendstudy.day38;

import com.backendstudy.day27.CreateTodoRequest;
import com.backendstudy.day37.TodoEntity;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/day38/todos")
public class Day38TodoController {
    private final Day38TodoRepository repository;

    public Day38TodoController(Day38TodoRepository repository) {
        this.repository = repository;
    }

    // 1. Todo 저장
    @PostMapping
    public ResponseEntity<TodoResponse> create(
            @RequestBody CreateTodoRequest request) {
        
        TodoEntity todo = new TodoEntity(request.title(), false);

        TodoEntity saved = repository.save(todo);

        return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(saved));
    }

    // 2. Todo 단건 조회
    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> findOne(@PathVariable Long id) {
        return repository.findById(id)
                .map(todo -> ResponseEntity.ok(toResponse(todo)))
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. Todo 전체 조회
    @GetMapping
    public List<TodoResponse> findAll() {
        return repository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    private TodoResponse toResponse(TodoEntity entity) {
        return new TodoResponse(entity.getId(), entity.getTitle(), entity.isCompleted());
    }

    public record CreatedTodoRequest(String title) {
    }

    public record TodoResponse(Long id, String title, boolean completed) {
    }
}
