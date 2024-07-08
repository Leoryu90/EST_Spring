package com.example.basic.day3.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}