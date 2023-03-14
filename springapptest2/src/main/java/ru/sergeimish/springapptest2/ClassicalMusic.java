package ru.sergeimish.springapptest2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
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
