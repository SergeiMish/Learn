package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    public String Rock() {
        MusicStyle musicRock = MusicStyle.ROCK;
        List<String> musicStile = new ArrayList<>();
        musicStile.add("Song of Silents");
        musicStile.add("Invaders must die");
        musicStile.add("Mutter");
        Random random = new Random();
        return musicStile.get(random.nextInt(musicStile.size()));
    }
    public String getSong() {
        return musicRock;
    }
}
