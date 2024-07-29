package ru.yandex.practicum;

public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    public PotatoSoup(Bouillon anotherBouillon, int i, int i1) {
        super(anotherBouillon.meat, anotherBouillon.salt);
    }

    public PotatoSoup(SoupBase soupBase, int i, int i1, int i2) {
        super(soupBase, soupBase.salt);
    }

    public PotatoSoup(int i, int i1, int i2, int i3, int i4) {
        super();
    }


    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты картофельного супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
        System.out.println("Картошка: " + potato + " шт.");
        System.out.println("Морковка: " + carrot + " шт.");
    }
}