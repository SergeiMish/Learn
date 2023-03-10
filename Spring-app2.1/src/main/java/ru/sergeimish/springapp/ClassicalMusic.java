package ru.sergeimish.springapp;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moon Sonata";
    }
}
