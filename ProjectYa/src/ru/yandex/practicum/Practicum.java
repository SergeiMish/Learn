package ru.yandex.practicum;

@FunctionalInterface
interface Summator {
    int sum(int n1, int n2);
}

public class Practicum {

    public static void main(String[] args) {
        // сохраните лямбду в переменную
        // лямбда должна складывать два целых числа
       Summator summator = Integer::sum;
       int result = summator.sum(23,65);
        // допишите код, использующий лямбду
        System.out.println("Сумма 23 и 65 равна " + result);
    }
}