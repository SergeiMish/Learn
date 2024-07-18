package ru.practicum.dinner;

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
                    dinnerConstructor.addNewDishes();
                    break;
                case "2":
                    dinnerConstructor.generateDishCombos();
                    break;
                case "3":
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
