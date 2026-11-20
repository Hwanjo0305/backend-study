package com.backendstudy.day38;

import com.backendstudy.day37.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Day38TodoRepository extends JpaRepository<TodoEntity, Long> {
    
}
 