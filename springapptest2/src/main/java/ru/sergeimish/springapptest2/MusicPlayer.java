package ru.sergeimish.springapptest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
        @Autowired
        private RockMusic rockMusic;
        public MusicPlayer(RockMusic rockMusic){ this.rockMusic = rockMusic;}

        public void playMusic(){
            System.out.println("Now playing " + rockMusic.getSong());

        }
    }
