package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HelloController
 */

 @RestController
public class HelloController {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World!";
    }  
}