package com.example.firstDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/status")
    public String getStatus() {
        return "Hello World from Spring Boot";
    }

}
