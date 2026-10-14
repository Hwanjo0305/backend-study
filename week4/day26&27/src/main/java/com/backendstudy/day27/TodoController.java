package com.backendstudy.day27;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping ("/todos")
public class TodoController {
    private final TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping ("/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(
        @PathVariable Long id, 
        @RequestBody UpdateTodoRequest request
    ) {
        return todoService.updateTodo(id, request.title(), request.completed()
    );
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @PostMapping 
    @ResponseStatus (HttpStatus.CREATED)
    public Todo createTodo(@RequestBody CreateTodoRequest request) {
        return todoService.createTodo(request.title());
    }
    
}
