package ru.sergeimish.springapp2;

import org.springframework.stereotype.Component;

@Component("music")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moon Sonata";
    }
}
