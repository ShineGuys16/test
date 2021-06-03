package com.shiliu.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello I'm your father";
    }
}
