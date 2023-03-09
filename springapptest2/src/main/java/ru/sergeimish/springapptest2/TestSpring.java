package ru.sergeimish.springapptest2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("musicBean1", RockMusic.class);

        rockMusic.getSong();

        System.out.println(rockMusic);

    }
}
