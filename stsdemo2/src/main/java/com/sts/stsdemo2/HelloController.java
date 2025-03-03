package com.sts.stsdemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Value("${message:Hello from Microservice!}")
    private String message;


    
    @GetMapping("/hello")
    public String hello() {
    	return message;
    }
}