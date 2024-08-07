package ru.yandex.practicum;

public class Cat extends Pet{


    public Cat(String voice) {
        super(voice);
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }
}