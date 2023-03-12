package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {
        public String getSong() {
            return "Moon Sonata";
        }
}
