package com.mycompany.springweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings!";
    }

    @RequestMapping("/tony")
    public String greetTony() {
        return "Hello Tony!";
    }
}
