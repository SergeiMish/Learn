package ru.sergeimish.springapp2;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    public MusicPlayer(ClassicalMusic classicalMusic){ this.classicalMusic = classicalMusic;}

    public void playMusic(){
        System.out.println("Now playing " + classicalMusic.getSong());

        }
    }
