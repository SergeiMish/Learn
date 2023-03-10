package ru.sergeimish.springapp;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic implements Music{
//    private RockMusic(){}
//
//    public static RockMusic getRockMusic() {
//        return new RockMusic();
//    }
//    public void doMyInit(){
//        System.out.println("Im initialization");
//    }
//    public void doMyDestroy(){
//        System.out.println("Im destroy your bean");
//    }
    @Override
    public String getSong() {
        return "Highway to hell";
    }
}
