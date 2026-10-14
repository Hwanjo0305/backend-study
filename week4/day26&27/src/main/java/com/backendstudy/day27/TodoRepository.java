package com.backendstudy.day27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
    private final Map<Long, Todo> todos = new HashMap<>();

    public void save(Todo todo) {
        todos.put(todo.getId(), todo);
    }

    public List<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }

    public Todo findById(Long id) {
        return todos.get(id);
    }

    public void deleteById(Long id) {
        todos.remove(id);
    }
}
