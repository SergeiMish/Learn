package ru.sergeimish.springapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(musicPlayer);
        System.out.println(secondMusicPlayer);

        musicPlayer.playMusicList();
        secondMusicPlayer.playMusicList();

        context.close();
    }
}
