package com.example.webshop_tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Hello {
    @GetMapping("/hello")
    public static String hello() {
        return "Hello World";
    }
}
