package ru.sergeimish.springapp2;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    public MusicPlayer(Music music){ this.music = music;}

    public void playMusic(){
        System.out.println("Now playing " + music.getSong());

        }
    }
