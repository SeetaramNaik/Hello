package com.seetu.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "<h1>Hello all......I am just a test!!!</h1>";

    }
}
