package com.backendstudy.day33;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public record TodoCreateRequest(
    @NotBlank(message = "제목은 비워둘 수 없습니다.")
    String title,

    @NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    String notificationEmail
) {
}
