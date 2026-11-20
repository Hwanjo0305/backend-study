package com.backendstudy.day33;

import com.backendstudy.day32.TodoResponse;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


@RestController 

@RequestMapping("/day33/todos")
public class Day33Controller {
    private final Map<Long, TodoResponse> todos = new ConcurrentHashMap<>();

    private final AtomicLong sequence = new AtomicLong(1);

    @PostMapping
    public ResponseEntity<TodoResponse> createTodo(
            @Valid @RequestBody TodoCreateRequest request) {
            
        Long id = sequence.getAndIncrement();

        TodoResponse response = new TodoResponse(id,request.title(),false);
        
        todos.put(id,response);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
        
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> getTodo(
            @PathVariable  Long id) {
        
        TodoResponse todo = todos.get(id);

        if(todo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todo);
    }

}
