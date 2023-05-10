package com.example.gradleapprunnersnap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{

    @RequestMapping("/")
    public String index(){
        String s = "Hello World";
        return s;
    }
}
