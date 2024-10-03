package ru.yandex.practicum;

import java.util.concurrent.ThreadLocalRandom;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Лямбда, возвращающая целое число в интервале от 1 до 100
        // Укажите правильный тип данных для переменной randomInt
        ... randomInt = () -> ThreadLocalRandom.current().nextInt(0,100);
        // Лямбда, проверяющая, является ли число простым
        // Укажите правильный тип данных для переменной isPrime
        ... isPrime = number -> {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            return count == 2;
        };
        // Лямбда, принимающая два аргумента (целое число и строку) и выводящая сообщение
        // укажите правильные параметры типа для BiConsumer
        BiConsumer ... outputConsumer =
                (num, str) -> System.out.println("Число " + num + " " + str);

        // Используем созданные лямбды
        for (int i = 0; i < 10; i++) {
            Integer number = // получаем случайное целое число

            if (/* проверяем, что число простое */) {
                // используйте нужный функциональный метод
                outputConsumer ... (number, "является простым.");
            } else {
                // используйте нужный функциональный метод
                outputConsumer ... (number, "не является простым.");
            }
        }
    }
}