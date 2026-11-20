package com.backendstudy.day29;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage() {
        return "Hello Spring DI!";
    }
}
