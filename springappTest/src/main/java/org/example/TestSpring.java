package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       firstMusicPlayer.playMusicList();
       secondMusicPlayer.playMusicList();

        context.close();

    }
}
