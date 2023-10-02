package com.surfproject.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainTest {
    @GetMapping("/welcome")
    public String welcome() {

        return "Hello World";
    }
}