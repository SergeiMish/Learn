package ru.yandex.practicum;

public class Hamster extends Pet{
    public Hamster(int pawsCount) {
        super(pawsCount);
    }

    public void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}