package com.example.firstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstDemoApplication {

    public static void main(String[] args) {
        System.err.println("Hello I am in main method");
        SpringApplication.run(FirstDemoApplication.class, args);
    }

}
