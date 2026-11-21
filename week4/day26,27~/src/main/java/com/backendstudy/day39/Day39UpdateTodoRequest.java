package com.backendstudy.day39;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record Day39UpdateTodoRequest(
    @NotBlank String title,
    @NotNull Boolean completed
) {
}
