package ru.yandex.practicum;

public class Dog extends Pet {

    public Dog(String voice) {
        super(voice);
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}