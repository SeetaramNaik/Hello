package com.seetu.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class Hello {

    @GetMapping("/hi")
    public String hi() {
        return "Hi Test file...I'm good!!!";
    }

    //Dummy comment
    

}
