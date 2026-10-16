package com.backendstudy.day31;

import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/day31")
public class Controller {
    // 1. Query Parameter
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "guest") String name) {
        return "Hello, " + name;
    }

    // 2. Path Variable
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable  Long id) {
        return "User ID: " + id;
    }

    // 3. Request body
    @PostMapping("/users")
    public String createUser(@RequestBody UserRequest request) {
        return "Created user: " + request.name();
    }

    public record UserRequest(String name) {}
}
