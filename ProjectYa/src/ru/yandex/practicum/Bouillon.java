package ru.yandex.practicum;

public class Bouillon extends SoupBase {
    double meat;

    public Bouillon(double water, double salt) {
        super(water, salt);
    }

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты бульона:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
    }
}