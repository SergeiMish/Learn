package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    public void Rock() {
        MusicStyle musicStyle = MusicStyle.ROCK;
        List<String> musicStile = new ArrayList<>();
        musicStile.add("Song of Silents");
        musicStile.add("Invaders must die");
        musicStile.add("Mutter");

    }

    public String getSong() {
        return "Kollizium";
    }
}
