package com.melisima.eventek.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/test")
public class TestController {


    @GetMapping("/hello")
    private String sayHello(){
        return "hello,world";
    }

}
