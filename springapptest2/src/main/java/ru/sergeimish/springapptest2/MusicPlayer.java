package ru.sergeimish.springapptest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
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
        }

        }
    }
