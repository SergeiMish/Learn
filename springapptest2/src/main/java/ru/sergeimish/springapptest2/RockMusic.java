package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;
@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Kollizium";
    }
}
