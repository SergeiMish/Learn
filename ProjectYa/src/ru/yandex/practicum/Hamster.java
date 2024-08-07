package ru.yandex.practicum;

public class Hamster extends Pet{
    public Hamster(String voice) {
        super(voice);
    }

    public void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}