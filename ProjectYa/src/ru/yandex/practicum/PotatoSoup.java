package ru.yandex.practicum;

public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    public PotatoSoup(Bouillon anotherBouillon, int potato, int carrot) {
        super(anotherBouillon.water, anotherBouillon.salt);
        this.meat = anotherBouillon.meat;
        this.carrot = carrot;
        this.potato = potato;
    }

    public PotatoSoup(SoupBase soupBase, int vegetables, int potato, int carrot) {
        super(soupBase, vegetables);
        this.carrot = carrot;
        this.potato = potato;
    }

    public PotatoSoup(int water, int salt, int vegetables, int potato, int carrot) {
        super(water, salt, vegetables);
        this.carrot = carrot;
        this.potato = potato;
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