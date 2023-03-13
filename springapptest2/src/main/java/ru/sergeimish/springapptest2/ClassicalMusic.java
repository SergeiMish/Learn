package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalSongs = new ArrayList<>();

    {
        classicalSongs.add("Moon Sonata");
        classicalSongs.add("Bee Fly");
        classicalSongs.add("Mozart");

    }
    @Override
    public List<String> getSong() {
        return classicalSongs;
    }
}
