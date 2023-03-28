package ru.MVCtest.config.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false)String name ,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {



//        System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message","Hello " + name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "A", required = false)String a,
                             @RequestParam(value = "B", required = false) String b,
                             Model model2) {
        model2.addAttribute("number", "action ");
        return "first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}