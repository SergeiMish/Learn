package ru.sergeimish.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    public MusicPlayer(){}
    @Autowired
    private ClassicalMusic classicalMusic;
    public MusicPlayer(ClassicalMusic classicalMusic){ this.classicalMusic = classicalMusic;}

    public void playMusic(){
        System.out.println("Now playing " + classicalMusic.getSong());

        }
    }
