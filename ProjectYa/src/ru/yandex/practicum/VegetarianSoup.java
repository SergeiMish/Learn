package ru.yandex.practicum;

public class VegetarianSoup extends SoupBase {
    double vegetables;

    public VegetarianSoup(double water, double salt) {
        super(water, salt);
    }

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}