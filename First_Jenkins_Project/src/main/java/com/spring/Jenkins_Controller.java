package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins_Controller {
	

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

}
