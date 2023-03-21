package ru.MVCtest.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(){

    }
    @GetMapping("/goodbye")
    public String goodByePage(){

    }

}
