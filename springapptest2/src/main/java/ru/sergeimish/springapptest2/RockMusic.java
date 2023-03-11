package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic implements Music {
    public String getSong() {
        return "Kollizium";
    }
}
