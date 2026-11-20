package com.backendstudy.day27;

public record UpdateTodoRequest(
    String title,
    boolean completed
) {
    
}