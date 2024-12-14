package com.example.SpringSecEx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "he";
    }

    @GetMapping("/jj")
    public String go(){
        return "GPOO";
    }
}
