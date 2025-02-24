package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome batch 7 participants!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
