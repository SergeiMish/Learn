package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println(comparison);

        firstMusicPlayer.setVolume(20);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();

    }
}
