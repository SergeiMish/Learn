package ru.yandex.practicum;

public class SoupBase {
    double water;
    double salt;
    public SoupBase(double water, double salt){

    }
    // реализуйте конструктор

    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}