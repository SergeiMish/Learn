package ru.MVCtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-wrold")
    public String sayHello(){
    return "hello_world";
    }
}
