package ru.yandex.practicum;

public class Dog extends Pet{
    public Dog(int pawsCount) {
        super(pawsCount);
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}