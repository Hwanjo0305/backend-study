package com.backendstudy.day27;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/todos")
public class TodoController {
    private final TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoResponse> getTodos() {
        return todoService.getAllTodos()
                .stream()
                .map(TodoResponse::from)
                .toList();
    }

    @GetMapping ("/{id}")
    public TodoResponse getTodo(@PathVariable Long id) {
        Todo todo = todoService.getTodo(id);
        return TodoResponse.from(todo);
    }

    @PutMapping("/{id}")
    public TodoResponse updateTodo(
        @PathVariable Long id, 
        @RequestBody UpdateTodoRequest request
    ) {
        Todo todo = todoService.updateTodo(
            id,
            request.title(),
            request.completed()
        );
        return TodoResponse.from(todo);
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @PostMapping 
    @ResponseStatus (HttpStatus.CREATED)
    public TodoResponse createTodo(
        @Valid @RequestBody CreateTodoRequest request
    ) {
        Todo todo = todoService.createTodo(request.title());
        return TodoResponse.from(todo);
    }
    
}
