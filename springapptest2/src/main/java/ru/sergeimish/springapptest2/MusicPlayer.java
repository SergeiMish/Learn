package ru.sergeimish.springapptest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    @Autowired
        private Music music;

    public MusicPlayer(Music music){ this.music = music;}

        public void playMusic(){
            System.out.println("Now playing " + music.getSong());

        }
    }
