package ru.yandex.practicum;
import java.util.function.BiFunction;

interface Summator {
    int sum(int n1, int n2);
}

public class Practicum {

    public static void main(String[] args) {
        // сохраните лямбду в переменную
        // лямбда должна складывать два целых числа
        ... summator = (n1, n2) -> ...;
        // допишите код, использующий лямбду
        System.out.println("Сумма 23 и 65 равна " + ...);
    }
}