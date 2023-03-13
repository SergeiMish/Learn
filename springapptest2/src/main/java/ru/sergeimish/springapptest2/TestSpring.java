package ru.sergeimish.springapptest2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName() + musicPlayer.getVolume());

//        musicPlayer.playMusic(MusicStyle.ROCK);
//        musicPlayer.playMusic(MusicStyle.CLASSICAL);



        context.close();

    }
}
