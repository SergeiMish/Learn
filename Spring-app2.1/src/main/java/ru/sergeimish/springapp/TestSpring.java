package ru.sergeimish.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = musicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(musicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        musicPlayer.setVolume(25);
//
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
