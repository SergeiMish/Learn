package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static ru.practicum.dinner.Main.dinnerConstructor;
import static ru.practicum.dinner.Main.scanner;

public class DinnerConstructor {


    private static void addNewDish(String dishType, String dishName) {

        // добавьте новое блюдо
    }
    public void addNewDishes(String dishType, String dishName){
        addNewDish(dishType, dishName);
    }

    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");
        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = scanner.nextLine();

        //реализуйте ввод типов блюд
        while (!nextItem.isEmpty()) {

        }

        // сгенерируйте комбинации блюд и выведите на экран

    }
    public void generateDishCombos(){
        generateDishCombo();
    }
}
