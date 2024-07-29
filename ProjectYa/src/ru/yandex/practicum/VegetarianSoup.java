package ru.yandex.practicum;

public class VegetarianSoup extends SoupBase {
    double vegetables;

    public VegetarianSoup(double water, int salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }

    public VegetarianSoup(SoupBase soupBase, int vegetables) {
        super(soupBase.water, vegetables);
        this.salt = soupBase.salt;
        this.vegetables = vegetables;
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