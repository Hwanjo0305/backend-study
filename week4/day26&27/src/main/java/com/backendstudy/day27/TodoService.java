package com.backendstudy.day27;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TodoService {
    private final TodoRepository todoRepository;
    private long nextId = 1L;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(String title) {
        Todo todo = new Todo(nextId++, title, false);
        todoRepository.save(todo);
        return todo;
    }

    public Todo getTodo(Long id) {
        Todo todo = todoRepository.findById(id);

        if(todo == null) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Todo not found");
        };
        return todo;
    }

    public Todo updateTodo(Long id, String title, boolean completed) {
        Todo todo = getTodo(id);

        todo.setTitle(title);
        todo.setCompleted(completed);

        todoRepository.save(todo);

        return todo;
    }

    public void deleteTodo(Long id) {
        getTodo(id);
        todoRepository.deleteById(id);
    }
    
}
