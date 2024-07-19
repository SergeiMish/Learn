package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static DinnerConstructor dinnerConstructor;
    static Scanner scanner;

    public static void main(String[] args) {
        dinnerConstructor = new DinnerConstructor();
        scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Введите тип блюда:");
                    String dishType = scanner.nextLine();
                    System.out.println("Введите название блюда:");
                    String dishName = scanner.nextLine();

                    dinnerConstructor.addNewDishes(dishType, dishName);
                    break;
                case "2":
                    System.out.println("Начинаем конструировать обед...");
                    System.out.println("Введите количество наборов, которые нужно сгенерировать:");
                    int numberOfCombos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
                    String nextItem = scanner.nextLine();
                    dinnerConstructor.checkType(nextItem);
                    ArrayList<String> list = new ArrayList<>();
                    while (!nextItem.isEmpty()) {
                        if (dinnerConstructor.checkType(nextItem)) {
                            System.out.println("Такой категории нет, введите верное значение. Вы ввели " + nextItem);
                        } else {
                            list.add(nextItem);
                        }
                        nextItem = scanner.nextLine();
                        if (nextItem.isEmpty()) {
                            break;
                        }
                    }
                    dinnerConstructor.generateDishCombos(numberOfCombos, list);
                    break;
                case "3":
                    System.out.println("Erat magnus dies, sed suus ' super. Mox te videre.");
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }
}
