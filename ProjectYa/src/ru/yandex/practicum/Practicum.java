package ru.yandex.practicum;

public class Practicum {

    public static void main(String[] args) {
        Cat cat = new Cat("Мяу");
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog("Гав");
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster("Фыр");
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish("-");
        fish.sleep();

        Spider spider = new Spider("=");
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}