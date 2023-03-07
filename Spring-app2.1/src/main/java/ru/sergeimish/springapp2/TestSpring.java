package ru.sergeimish.springapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("musicBean1",RockMusic.class);


        System.out.println(rockMusic.getSong());
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
        context.close();
    }
}
