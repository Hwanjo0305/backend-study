package com.backendstudy.day39;

import com.backendstudy.day37.TodoEntity;
import com.backendstudy.day38.Day38TodoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class Day39TodoService {
    private final Day38TodoRepository repository;
    
    public Day39TodoService(Day38TodoRepository repository) {
        this.repository = repository;
    }

    //수정
    @Transactional
    public void updateTodo(Long id, String title, boolean completed) {
        TodoEntity todo = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
        
        todo.update(title, completed);
    }

    //삭제
    @Transactional
    public void deleteTodo(Long id) {
        TodoEntity todo = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
        
        repository.delete(todo);
    }
}
