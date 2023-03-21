package ru.MVCtest.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping
    public String helloPage(){

    }
    @GetMapping
    public String gooodByePage(){

    }

}
