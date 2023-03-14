package ru.sergeimish.springapptest2;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private RapMusic rapMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }
    public class StyleMusic {
        List<String> style = new ArrayList<>();
        {
            style.add(String.valueOf(classicalMusic));
            style.add(String.valueOf(rockMusic));
            style.add(String.valueOf(rapMusic));
        }
    }

    public void playMusic(List<String> style) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (style == classicalMusic) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (style == rockMusic) {
            System.out.println(rockMusic.getSong().get(randomNumber));
        } else if (style == rapMusic) {
            System.out.println(rapMusic.getSong().get(randomNumber));
        }
    }
}
