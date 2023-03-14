package ru.sergeimish.springapptest2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my init");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }
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
