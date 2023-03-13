package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
        public List<String> getSong() {
            return "Moon Sonata";
        }
}
