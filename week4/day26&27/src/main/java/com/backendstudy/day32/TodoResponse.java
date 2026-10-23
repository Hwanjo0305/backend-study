package com.backendstudy.day32;

public record TodoResponse(
        Long id,
        String title,
        boolean completed
) {
    
}
