package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DinnerConstructor {
    /**
     * Поле таблицы
     */
    static Map<String, ArrayList<String>> dishes = new HashMap<>();

    /**
     * Private метод addNewDish внутри конструктора для добавления новых позиций
     *
     * @param dishType
     * @param dishName
     */
    private static void addNewDish(String dishType, String dishName) {
        if (dishes.containsKey(dishType)) {
            ArrayList<String> list = dishes.get(dishType);
            if (list.contains(dishName)) {
                System.out.println("-".repeat(10));
                System.out.println("Такое блюдо уже есть в списке");
                System.out.println("-".repeat(10));
            } else {
                list.add(dishName);
            }
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(dishName);
            dishes.put(dishType, list);
        }
    }

    /**
     * Присвоение методу addNewDish публичного класса public
     *
     * @param dishType
     * @param dishName
     */
    public void addNewDishes(String dishType, String dishName) {
        addNewDish(dishType, dishName);
        System.out.println(dishes);
    }

    /**
     * Private метод generateDishCombo внутри конструктора для герерации КОМБО наборов
     *
     * @param numberOfCombos
     * @param list
     */
    private static void generateDishCombo(int numberOfCombos, ArrayList<String> list) {
        Random random = new Random();
        for (int i = 0; i < numberOfCombos; i++) {
            System.out.println("Комбо " + (i + 1) + " ");
            for (String type : list) {
                ArrayList<String> dishOfTypes = dishes.get(type);
                String randomOfDish = dishOfTypes.get(random.nextInt(dishOfTypes.size()));
                System.out.println(randomOfDish);
            }
        }
    }

    /**
     * Присвоение методу generateDishCombo публичного класса public
     *
     * @param numberOfCombos
     * @param list
     */
    // сгенерируйте комбинации блюд и выведите на экран
    public void generateDishCombos(int numberOfCombos, ArrayList<String> list) {
        generateDishCombo(numberOfCombos, list);
    }

    /**
     * Метод checkType проверки наличия категорий
     *
     * @param type
     * @return
     */
    public boolean checkType(String type) {
        return !dishes.containsKey(type);
    }
}
