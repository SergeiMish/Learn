package ru.sergeimish.springapptest2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("45")
    private int volume;
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;

    }

    public void playMusic(MusicStyle style){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(style == MusicStyle.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (style == MusicStyle.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
        }
    }
