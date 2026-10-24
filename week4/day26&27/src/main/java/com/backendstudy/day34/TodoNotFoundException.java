package com.backendstudy.day34;

public class TodoNotFoundException extends RuntimeException {
    
    public TodoNotFoundException(long id) {
        super("Todo ID " + id + "를 찾을 수 없습니다.");
    }
}
