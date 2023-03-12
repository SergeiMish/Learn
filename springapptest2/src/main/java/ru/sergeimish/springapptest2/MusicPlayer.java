package ru.sergeimish.springapptest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    @Autowired
    private Music music;

        public String playMusic(){
           return "Now playing " + music.getSong();
        }
    }
