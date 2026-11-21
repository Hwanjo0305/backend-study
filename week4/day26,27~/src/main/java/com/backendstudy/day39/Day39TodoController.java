package com.backendstudy.day39;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/day39/todos")
public class Day39TodoController {
    private final Day39TodoService service;
    
    public Day39TodoController(Day39TodoService service) {
        this.service = service;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTodo(@PathVariable long id, @Valid @RequestBody Day39UpdateTodoRequest request) {
        service.updateTodo(id, request.title(), request.completed());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable long id) {
        service.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}
