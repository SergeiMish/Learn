package ru.yandex.practicum;

public class Cat extends Pet{
    public Cat(int pawsCount) {
        super(pawsCount);
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }
}