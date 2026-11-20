package com.backendstudy.day32;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/day32/todos")
public class Day32Controller {

    @PostMapping
    public TodoResponse createTodo(
            @RequestBody TodoCreateRequest request) {

        Todo todo = new Todo(1L, request.title(),false);

        return new TodoResponse(todo.getId(),todo.getTitle(),todo.isCompleted());
    }

    @GetMapping("/example")
    public TodoResponse getExample() {
        Todo todo = new Todo(2L,"Spring MVC 복습",true);

        return new TodoResponse(todo.getId(),todo.getTitle(),todo.isCompleted());
    }
    
}
