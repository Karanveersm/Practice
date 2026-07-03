package com.example.Practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/greet")
    public String greet(){
        return "hello world ";
    }

}
