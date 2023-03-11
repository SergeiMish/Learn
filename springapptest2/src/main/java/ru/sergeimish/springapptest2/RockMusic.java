package ru.sergeimish.springapptest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic {
    @Autowired
    private RockMusic rockMusic;

    public MusicPlayer (RockMusic rockMusic){ this.rockMusic = rockMusic;}

    public void playMusic(){
        System.out.println("Now playing " + rockMusic.getSong(););
    }
    public void getSong(){
        System.out.println("Kollisium");
    }

}
